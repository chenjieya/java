package org.orm.com;

import org.orm.com.exception.ResultContException;
import org.orm.com.exception.SqlFormatException;

import java.util.ArrayList;

public class SqlSession {

    private JdbcExecutor executor;

    public SqlSession() {
        this(false);
    }

    public SqlSession(boolean isAutoCommit) {
        this.executor = new JdbcExecutor(isAutoCommit);
    }

    public int inster(String sql, Object params) {
        if ("insert".equalsIgnoreCase(sql.substring(0, 6))) {
            return executor.doUpdate(sql, false, params);
        }
        throw new SqlFormatException("sql format error:" + sql);
    }

    public int inster(String sql) {
        return inster(sql, null);
    }

    public int update(String sql, Object params) {
        if ("update".equalsIgnoreCase(sql.substring(0, 6))) {
            return executor.doUpdate(sql, false, params);
        }
        throw new SqlFormatException("sql format error:" + sql);
    }

    public int update(String sql) {
        return update(sql, null);
    }

    public int delete(String sql, Object params) {
        if ("delete".equalsIgnoreCase(sql.substring(0, 6))) {
            return executor.doUpdate(sql, false, params);
        }
        throw new SqlFormatException("sql format error:" + sql);
    }

    public int delete(String sql) {
        return delete(sql, null);
    }

    public <T> ArrayList<T> selectList(String sql, Object params, Class<T> clazz ) {
        if ("select".equalsIgnoreCase(sql.substring(0, 6))) {
            return executor.doQuery(sql, clazz, params);
        }
        throw new SqlFormatException("sql format error:" + sql);
    }

    public <T> ArrayList<T> selectList(String sql, Class<T> clazz) {
        return this.selectList(sql, null, clazz);
    }

    public <T> T selectOne(String sql, Object params, Class<T> clazz) {
        ArrayList<T> list = this.selectList(sql, params, clazz);

        if (list == null || list.size() == 0) {
            // 没有找到数据
            return null;
        } else if(list.size() == 1) {
            // 找到一条数据
            return list.get(0);
        } else{
            // 找到了多条数据，说明sql出现了问题
            throw new ResultContException("查询出来多条记录，请检查sql："+sql);
        }
    }

    public <T> T selectOne(String sql, Class<T> clazz) {
        return this.selectOne(sql, null, clazz);
    }


    public void commit() {
        executor.commit();
    }

    public void rollback() {
        executor.rollback();
    }

    public void closeConnect() {
        executor.closeConnect();
    }


}
