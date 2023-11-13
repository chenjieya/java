package Dao;

import Domain.CarClass;

import java.sql.*;
import java.util.ArrayList;

public class CarDao {

    private String url = "jdbc:mysql://localhost:3306/duyi_orm";
    private String user = "root";
    private String password = "chenjie+00";

    // 插入数据
    public void insert(CarClass car) {
        Connection conn = null;
        PreparedStatement state = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            conn = DriverManager.getConnection(url,user, password);
            String sql = "insert into t_car(cname, color, price) values(?,?,?)";
            state = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            state.setString(1, car.getCname());
            state.setString(2, car.getColor());
            state.setDouble(3, car.getPrice());

            state.executeUpdate();

            ResultSet keys = state.getGeneratedKeys();
            keys.next();
            Long id = keys.getLong(1);
            System.out.println(id);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (conn != null) {
                    conn.close();
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

        }
    }


    public ArrayList<CarClass> searchAll() {
        ArrayList<CarClass> result = new ArrayList<>();
        Connection conn = null;
        PreparedStatement state = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            conn = DriverManager.getConnection(url,user, password);
            String sql = "select * from t_car";
            state = conn.prepareStatement(sql);


            ResultSet res = state.executeQuery();

            while(res.next()){
                CarClass cc = new CarClass();
                cc.setCno(res.getLong("cno"));
                cc.setCname(res.getString("cname"));
                cc.setColor(res.getString(3));
                cc.setPrice(res.getDouble(4));

                result.add(cc);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (conn != null) {
                    conn.close();
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

        }

        return result;
    }

    // 批量新增-事务处理
    public void insertAll(ArrayList<CarClass> carList) {
        Connection conn = null;
        PreparedStatement state = null;
        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建连接
            conn = DriverManager.getConnection(url,user, password);

            conn.setAutoCommit(false);  // 关闭事务自动提交

            for (CarClass cc : carList) {
                String sql = "insert into t_car(cname, color, price) values(?,?,?)";
                state = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                state.setString(1, cc.getCname());
                state.setString(2, cc.getColor());
                state.setDouble(3, cc.getPrice());

                state.executeUpdate();

                ResultSet keys = state.getGeneratedKeys();
                keys.next();
                Long id = keys.getLong(1);
                System.out.println(id);
            }

            conn.commit();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (conn != null) {
                    conn.close();
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

        }
    }
}
