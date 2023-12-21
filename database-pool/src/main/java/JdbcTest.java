import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {


    public static final String driver = "com.mysql.cj.jdbc.Driver";
    public static final String url = "jdbc:mysql://localhost:3306/schoole";
    public static final String user = "root";
    public static final String password = "chenjie+00";


    public static void main(String[] args) throws Exception {
        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from student";
        PreparedStatement stmt = connection.prepareStatement(sql);

        ResultSet resultSet = stmt.executeQuery();

        while(resultSet.next()) {

            String string = resultSet.getString(1);
            System.out.println(string);

        }


    }

}
