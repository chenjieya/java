package Dao;

import doman.Atm;

import java.sql.*;

public class AtmDao {

    public Atm selectOne(String aname) {
        Atm atm = null;
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet res = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // 加载驱动
            String url = "jdbc:mysql://localhost:3306/atm";
            String user = "root";
            String pwd = "chenjie+00";
            conn = DriverManager.getConnection(url, user, pwd);  // 创建连接

            String sql = "select * from atm where aname = ?";

            state = conn.prepareStatement(sql);  // 预先处理sql
            state.setString(1, aname);
             // state = conn.createStatement();
            res = state.executeQuery();

            if (res.next()) {
                atm = new Atm();
                atm.setBalance(res.getFloat("abalance"));
                atm.setName(res.getString("aname"));
                atm.setPassword(res.getString("apassword"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
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
                if (state != null) {
                    state.close();
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
        return atm;
    }

    public void update(Atm atm) {
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet res = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // 加载驱动
            String url = "jdbc:mysql://localhost:3306/atm";
            String user = "root";
            String pwd = "chenjie+00";
            conn = DriverManager.getConnection(url, user, pwd);  // 创建连接
            String sql = "update atm set apassword = ?, abalance = ? where aname = ?";
            // state = conn.createStatement();
            state = conn.prepareStatement(sql);
            state.setString(1, atm.getPassword());
            state.setFloat(2, atm.getBalance());
            state.setString(3, atm.getName());
            // String sql = "update atm set apassword = '"+atm.getPassword()+"', abalance = '"+atm.getBalance()+"' where aname = '"+atm.getName()+"'";
            state.executeUpdate();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
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
                if (state != null) {
                    state.close();
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

    public void insert(Atm atm) {
        Connection conn = null;
        Statement state = null;
        ResultSet res = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // 加载驱动
            String url = "jdbc:mysql://localhost:3306/atm";
            String user = "root";
            String pwd = "chenjie+00";
            conn = DriverManager.getConnection(url, user, pwd);  // 创建连接
            state = conn.createStatement();

            String sql = "insert into atm value('"+atm.getName()+"', '"+atm.getPassword()+"', "+atm.getBalance()+")";
            state.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
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
                if (state != null) {
                    state.close();
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

    public void delete(String aname) {
        Connection conn = null;
        Statement state = null;
        ResultSet res = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // 加载驱动
            String url = "jdbc:mysql://localhost:3306/atm";
            String user = "root";
            String pwd = "chenjie+00";
            conn = DriverManager.getConnection(url, user, pwd);  // 创建连接
            state = conn.createStatement();

            String sql = "delete from atm where aname = '"+aname+"'";
            state.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
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
                if (state != null) {
                    state.close();
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
