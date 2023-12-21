import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Test {

    private static ComboPooledDataSource dataSource;

    static {
        // 将指定配置文件中的 指定标签内容加载进来
        dataSource = new ComboPooledDataSource("myc3p0");
        String name = dataSource.getDataSourceName();

        System.out.println("数据源的名字"+name);
    }


    public static Connection getConn() {
        Connection conn=null;

        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return conn;
    }


    public static void closeConn(Connection conn) {
        try {
            if (conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        Connection conn = getConn();
        if (conn!=null) {
            System.out.println("连接成功");
        }
        closeConn(conn);
    }


}
