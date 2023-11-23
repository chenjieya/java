package dao;

import domain.CategoryClass;
import domain.ProductClass;

import java.sql.*;
import java.util.ArrayList;

public class ProductDao {

    private String url = "jdbc:mysql://localhost:3306/shopping";
    private String user = "root";
    private String password = "chenjie+00";

    public ProductClass selectOne(Integer pid) {
        ProductClass product = null;
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建链接
            connection = DriverManager.getConnection(this.url, this.user, this.password);
            // 创建命令集
            String sql = "SELECT pid,pname,price,cid FROM product WHERE pid = ?";
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, pid);

            resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                product = new ProductClass();
                product.setPrice(resultSet.getFloat("price"));
                product.setPname(resultSet.getString("pname"));
                product.setPid(resultSet.getInt("pid"));
                CategoryClass categoryClass = new CategoryClass();
                categoryClass.setCid(resultSet.getInt("cid"));
                product.setCategory(categoryClass);
            }


            return product;
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


    public ArrayList<ProductClass> selectProductByCid(Integer cid) {
        ArrayList<ProductClass> productArr = new ArrayList<>();
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        try {
            // 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 创建链接
            connection = DriverManager.getConnection(this.url, this.user, this.password);
            // 创建命令集
            String sql = "SELECT pid,pname,price,cid FROM product WHERE cid = ?";
            stmt = connection.prepareStatement(sql);

            stmt.setInt(1, cid);

            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                ProductClass productClass = new ProductClass();

                int pid = resultSet.getInt("pid");
                String pname = resultSet.getString("pname");
                Float price = resultSet.getFloat("price");

                CategoryClass categoryClass = new CategoryClass();
                categoryClass.setCid(resultSet.getInt("cid"));

                productClass.setPid(pid);
                productClass.setPname(pname);
                productClass.setPrice(price);
                productClass.setCategory(categoryClass);

                productArr.add(productClass);
            }


            return productArr;
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
