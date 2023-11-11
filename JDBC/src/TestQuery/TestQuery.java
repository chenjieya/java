package TestQuery;

import java.sql.*;

public class TestQuery {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // 加载驱动
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String password = "chenjie+00";
            Connection coon = DriverManager.getConnection(url, user, password);  // 获取连接
            coon.setAutoCommit(false);  // 关闭事务自动提交
            coon.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);

            Statement state = coon.createStatement();  // 创建状态参数

            // 执行操作
            String sql = "select * from emp where empno =  7369";

            // ResuleSet 类型   Set(Map<String, Object>)

            ResultSet res = state.executeQuery(sql);

            if (res.next()) {  // 判断是否有下一位 和迭代器类似
                // int empno = res.getInt("empno");
                int empno = res.getInt(1);  // 可以是索引，从1开始
                String ename = res.getString("ename");
                String job = res.getString("job");
                Float sal = res.getFloat("sal");
                Float comm = res.getFloat("comm");
                Date hiredate = res.getDate("hiredate");
                System.out.println(empno+"-"+ename+"-"+job+"-"+sal+"-"+comm+"-"+hiredate);

            }
            // 关闭操作
            res.close();
            state.close();
            coon.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
