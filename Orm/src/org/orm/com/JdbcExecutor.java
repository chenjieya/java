package org.orm.com;

import javax.sql.DataSource;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;

public class JdbcExecutor {

    private String url = "jdbc:mysql://192.168.1.19:3306/duyi_orm";
    private String user = "root";
    private String password = "chenjie+00";

    private Connection coon;
    private DataSource pool;

    private ArrayList<Long> generatedkeys;
    private boolean isAutoCommit;

    static {
        // 2. 加载驱动-驱动加载一次就行了，不需要每次调用方法得时候
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public JdbcExecutor(boolean isAutoCommit) {
        this.isAutoCommit = isAutoCommit;
        coon = getConnection();
    }

    public JdbcExecutor() {
        this(false);  // 默认是关闭自动提交
    }


    /**
     * 创建连接或者从连接池中获取连接
     * @return Connection
     */
    private Connection getConnection() {
        // 如果连接池存在，则在连接池中存
        if (pool!=null) {
            try {
                return pool.getConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else{
            // 连接池不存在，创建连接
            try {
                coon = DriverManager.getConnection(url, user,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return coon;
    }

    /**
     * 重载
     * @param sql sql
     * @param params 数组
     * @return int
     */
    public int doUpdate(String sql, Object...params) {
        return this.doUpdate(sql, false, params);
    }

    /**
     * INSERT UODATE DELETE
     * @see this#doUpdate(String,boolean,Object)
     */
    @Deprecated
    public int doUpdate(String sql, boolean isReturnGeneratedKeys, Object ...parmas) {
        // 1. 导入jar包
        // 4. 创建参数集
        PreparedStatement stmt = null;
        ResultSet keys = null;
        try {

            coon.setAutoCommit(isAutoCommit);  // 事务是否自动提交

            if (isReturnGeneratedKeys) {
                stmt = coon.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            } else{
                stmt = coon.prepareStatement(sql);
            }

            // 设置sql->?
            for(int i = 0; i < parmas.length; i++) {
                stmt.setObject(i+1, parmas[i]);
            }

            int count = stmt.executeUpdate();  // 返回值为此次增删改查操作得记录数

            if (isReturnGeneratedKeys) {
                keys = stmt.getGeneratedKeys();  // 自增主键id
                generatedkeys = new ArrayList<>();

                while(keys.next()) {
                    Long id = keys.getLong(1);
                    generatedkeys.add(id);
                }
            }

            return count;
        } catch (SQLException e) {
            // 出错回滚事务
            this.rollback();
            throw new RuntimeException(e);
        } finally {
            // 关闭-结果集/命令集/连接
            // 命令集需要每次都关闭，但是连接不一定要每次都关闭，比如说批量操作
            this.closeStmt(stmt);
            if (isReturnGeneratedKeys) {
                this.closeResult(keys);
            }
        }

    }

    public int doUpdate(String sql, boolean isReturnGeneratedKeys, Object params) {
        SqlHandler sqlObj = new SqlHandler();
        sqlObj.handleSql(sql);
        try {
            sqlObj.handleParams(params);
            return this.doUpdate(sqlObj.getOldSql(), isReturnGeneratedKeys, sqlObj.getParamsValues());
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * SELECT
     */
    public <T> ArrayList<T> doQuery(String sql, Class<T> rowType,  Object... parmas) {
        // 1. 导入jar包
        // 2. 加载驱动（Static）
        // 3. 创建连接（Constructor）
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            // 4. 创建命令集
            stmt = coon.prepareStatement(sql);

            // 5. 替换sql-> ?
            for(int i = 0; i < parmas.length; i++) {
                stmt.setObject(i+1, parmas[i]);
            }

            // 6. 结果集
            res = stmt.executeQuery();

            // 7. 将数据库表中的数据转换成java中的数据
            ResultHandler result = new ResultHandler();
            ArrayList<T> list = result.handler(res,rowType);
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            this.closeResult(res);
            this.closeStmt(stmt);
        }
    }

    public <T> ArrayList<T> doQuery(String sql, Class<T> rowType, Object params) {
        SqlHandler sqlObj = new SqlHandler();
        sqlObj.handleSql(sql);
        try {
            sqlObj.handleParams(params);
            return this.doQuery(sqlObj.getOldSql(), rowType, sqlObj.getParamsValues());
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 手动提交事务，交给开发者自己控制
     */
    public void commit() {
        try {
           if (!isAutoCommit && coon != null) {
               coon.commit();
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 回退
     */
    public void rollback() {
        try {
            if (!isAutoCommit && coon != null) {
                coon.rollback();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 关闭结果集
     * @param rs 结果集返回值
     */
    private void closeResult(ResultSet rs) {
        try {
            if (rs != null){
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 关闭命令集
     * @param stmt 命令集
     */
    private void closeStmt(Statement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 关闭连接-连接并不需要每次都关闭
     */
    public void closeConnect(){
        try {
            if (coon != null){
                coon.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取所有得新增当前sql产生得id  toArray 会在转换成数组得时候克隆一下
     * @return Long[]
     */
    public Long[] getGeneratedkeys() {
        return generatedkeys.toArray(new Long[]{});
    }

    /**
     * 多数情况都是执行一条sql
     * @return Long
     */
    public Long getGeneratedkey() {
        return generatedkeys.get(0);
    }
}
