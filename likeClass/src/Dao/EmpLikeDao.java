package Dao;

import Domain.Emp;

import java.sql.*;
import java.util.ArrayList;

public class EmpLikeDao {

    public ArrayList<Emp> searchLike(String ename) {
        ArrayList<Emp> result = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取数据库连接
            String user = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            String password = "chenjie+00";
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from emp where ename like \"%\"?\"%\"";
            PreparedStatement state = conn.prepareStatement(sql);
            // 第一个问号得位置替换成后面的内容
            // state.setString(1, "%" + ename + "%");
            state.setString(1,  ename);

            ResultSet res = state.executeQuery();

            while(res.next()) {
                Emp empObj = new Emp(
                        res.getInt("empno"),
                        res.getString("ename"),
                        res.getString("job"),
                        res.getString("mgr"),
                        res.getDate("hiredate"),
                        res.getFloat("sal"),
                        res.getFloat("comm"),
                        res.getInt("deptno")
                );

                result.add(empObj);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    public ArrayList<Emp> pageSearch(int rowIndex) {
        ArrayList<Emp> result = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取数据库连接
            String user = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            String password = "chenjie+00";
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from test.emp limit ?, 5";
            PreparedStatement state = conn.prepareStatement(sql);
            // 第一个问号得位置替换成后面的内容
            // state.setString(1, "%" + ename + "%");
            state.setInt(1,  rowIndex);

            ResultSet res = state.executeQuery();

            while(res.next()) {
                Emp empObj = new Emp(
                        res.getInt("empno"),
                        res.getString("ename"),
                        res.getString("job"),
                        res.getString("mgr"),
                        res.getDate("hiredate"),
                        res.getFloat("sal"),
                        res.getFloat("comm"),
                        res.getInt("deptno")
                );

                result.add(empObj);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
