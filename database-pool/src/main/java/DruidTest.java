import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Properties;

public class DruidTest {

    private static DataSource dataSource;

    static {
        Properties properties = new Properties();
        try {
            properties.load(DruidTest.class.getClassLoader().getResourceAsStream("druid.properties"));

            dataSource = DruidDataSourceFactory.createDataSource(properties);

            Connection conn = getConn();
            DatabaseMetaData metaData = conn.getMetaData();

            System.out.println(
                    metaData.getDatabaseProductName()+"-------"+metaData.getDatabaseProductVersion()
            );

            closeConn(conn);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 创建连接
    public static Connection getConn() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


    // 关闭连接
    public static void closeConn(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()){
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Connection conn = getConn();
            System.out.println("第"+i+"次"+conn);
            closeConn(conn);

        }

    }

}
