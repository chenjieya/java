package dao;

import domain.UserClass;

import java.sql.*;

public class UserDao {

    private String url = "jdbc:mysql://localhost:3306/shopping";
    private String user = "root";
    private String password = "chenjie+00";


    public UserClass selectOne(String username) {
        UserClass userClass = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建链接
            connection = DriverManager.getConnection(this.url, this.user, this.password);
            // 创建命令集
            String sql = "SELECT uname,upassword FROM user WHERE uname=?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);

            resultSet = stmt.executeQuery();
            
            if (resultSet.next()) {
                String uname = resultSet.getString("uname");
                String upassword = resultSet.getString("upassword");

                userClass = new UserClass();
                userClass.setPassword(upassword);
                userClass.setUsername(uname);
            }

            return userClass;
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


    public void insert(UserClass userClass) {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建链接
            connection = DriverManager.getConnection(this.url, this.user, this.password);
            // 创建命令集
            String sql = "INSERT INTO USER VALUES(?,?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, userClass.getUsername());
            stmt.setString(2, userClass.getPassword());

            stmt.executeUpdate();

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
