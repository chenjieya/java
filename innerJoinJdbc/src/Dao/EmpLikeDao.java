package Dao;

import Domain.Dept;
import Domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class EmpLikeDao {

    public ArrayList<Emp> innerSearch() {
        ArrayList<Emp> result = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取数据库连接
            String user = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            String password = "chenjie+00";
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from emp e inner join dept d where e.deptno = d.deptno";
            PreparedStatement state = conn.prepareStatement(sql);
            // 第一个问号得位置替换成后面的内容
            // state.setString(1, "%" + ename + "%");

            ResultSet res = state.executeQuery();

            while(res.next()) {
                Dept dept = new Dept(
                        res.getInt("deptno"),
                        res.getString("dname"),
                        res.getString("loc")
                );
                Emp empObj = new Emp(
                        res.getInt("empno"),
                        res.getString("ename"),
                        res.getString("job"),
                        res.getString("mgr"),
                        res.getDate("hiredate"),
                        res.getFloat("sal"),
                        res.getFloat("comm"),
                        dept
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

    public ArrayList<HashMap<String, Object>> zidingyi() {
        ArrayList<HashMap<String, Object>> result = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 获取数据库连接
            String user = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            String password = "chenjie+00";
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "select deptno, count(ename) as ct from emp group by deptno";
            PreparedStatement state = conn.prepareStatement(sql);
            // 第一个问号得位置替换成后面的内容
            // state.setString(1, "%" + ename + "%");

            ResultSet res = state.executeQuery();

            while(res.next()) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("deptno", res.getInt("deptno"));
                map.put("ct", res.getInt("ct"));

                result.add(map);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
