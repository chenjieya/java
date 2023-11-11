import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
//        1. 导包（将找到的这个jar文件包导入到java工程中）
//        2. 加载驱动类  Driver
//        3. 获取连接
//        4. 创建状态参数
//        5. 执行数据库操作
//        6. 关闭

        try {
            //2 . 加载驱动类  Driver
            Class.forName("com.mysql.jdbc.Driver");   // 加载了类 类中的静态元素就执行了
            // 3. 获取连接
            String url = "jdbc:mysql://localhost:3306/test";  // "jdbc:mysql://ip:端口/数据库名"
            String user = "root";
            String password = "chenjie+00";
            Connection coon =  DriverManager.getConnection(url,user, password);
            // 4. 创建状态参数
            Statement state =  coon.createStatement();

            // 5. 执行数据库操作
            // String sql = "insert into emp(empno, ename, job) values(1, 'alvis', 'dev')";
            String sql = "delete from emp where empno = 1";
            state.executeUpdate(sql);
            System.out.println("执行完毕");

            // 6.关闭
            state.close();
            coon.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}