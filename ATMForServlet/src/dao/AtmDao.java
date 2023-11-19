package dao;

import domain.AtmClass;

import java.sql.*;

public class AtmDao {

    public AtmClass selectOne(String username) {
        AtmClass atm = null;
        // 加载驱动
        ResultSet res = null;
        PreparedStatement stmt = null;
        Connection conn = null;
        try {
            String url = "jdbc:mysql://192.168.1.19:3306/atm";
            String user = "root";
            String pwd = "chenjie+00";

            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            conn = DriverManager.getConnection(url,user,pwd);

            String sql = "SELECT ANAME, APASSWORD,ABALANCE FROM ATM WHERE ANAME = ?";

            // 创建命令集
            stmt = conn.prepareStatement(sql);

            // 给问号赋值
            stmt.setString(1, username);

            res = stmt.executeQuery();

            if (res.next()) {
                atm = new AtmClass(res.getString(1), res.getString(2), res.getFloat(3));
            }

            System.out.println(atm);
            return atm;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (res != null) {
                    res.close();
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
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public Float getBalance(String username) {
        return this.selectOne(username).getAbalance();
    }

    public void updateBalance(String name, Float money) {
        // 加载驱动
        PreparedStatement stmt = null;
        Connection conn = null;
        try {
            String url = "jdbc:mysql://192.168.1.19:3306/atm";
            String user = "root";
            String pwd = "chenjie+00";

            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            conn = DriverManager.getConnection(url,user,pwd);

            String sql = "UPDATE ATM SET ABALANCE = ABALANCE + ? WHERE ANAME = ?";

            // 创建命令集
            stmt = conn.prepareStatement(sql);

            // 给问号赋值
            stmt.setFloat(1, money);
            stmt.setString(2, name);


            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
