package dao;

import domain.UserClass;

import java.sql.*;

public class AtmDao {

    private String username = "root";
    private String password = "chenjie+00";
    private String url = "jdbc:mysql://localhost:3306/atm";
    private String fullname = "com.mysql.cj.jdbc.Driver";


    public UserClass selectOne(String user) {

        UserClass userClass = new UserClass();
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            Class<?> aClass = Class.forName(this.fullname);

            connection = DriverManager.getConnection(this.url, this.username, this.password);

            String sql = "SELECT ANAME,APASSWORD,ABALANCE,NICKNAME FROM ATM WHERE ANAME = ?";

            stmt = connection.prepareStatement(sql);

            stmt.setString(1, user);

            resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                userClass = new UserClass();
                userClass.setAname(resultSet.getString("ANAME"));
                userClass.setApassword(resultSet.getString("APASSWORD"));
                userClass.setAbalance(resultSet.getFloat("aBALANCE"));
                userClass.setNickname(resultSet.getString("NICKNAME"));
            }
            return userClass;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null){
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                if (stmt != null){
                    stmt.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
