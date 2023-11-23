package dao;

import domain.CategoryClass;
import domain.UserClass;

import java.sql.*;
import java.util.ArrayList;

public class CategoryDao {
    private String url = "jdbc:mysql://localhost:3306/shopping";
    private String user = "root";
    private String password = "chenjie+00";


    public ArrayList<CategoryClass> selectAll() {
        ArrayList<CategoryClass> categoryArr = new ArrayList<>();
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建链接
            connection = DriverManager.getConnection(this.url, this.user, this.password);
            // 创建命令集
            String sql = "SELECT * FROM category";
            stmt = connection.prepareStatement(sql);

            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                CategoryClass categoryClass = new CategoryClass();

                categoryClass.setCid(resultSet.getInt("cid"));
                categoryClass.setCname(resultSet.getString("cname"));

                categoryArr.add(categoryClass);
            }


            return categoryArr;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
