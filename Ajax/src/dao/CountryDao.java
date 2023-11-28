package dao;

import domain.CountryClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CountryDao {

    private String drive = "com.mysql.cj.jdbc.Drive";
    private String url = "jdbc:mysql://localhost:3306/test";
    private String user = "root";
    private String pwd = "chenjie+00";


    public ArrayList<CountryClass> selectCountry() {

        ArrayList<CountryClass> list = null;

        try {
            Class.forName(drive);
            Connection connection = DriverManager.getConnection(this.url, this.user, this.pwd);

            String sql = "SELECT CID,CNAME FROM COUNTRY";

            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet resultSet = stmt.executeQuery();

            list = new ArrayList<>();

            while (resultSet.next()) {
                CountryClass countryClass = new CountryClass(resultSet.getString("CNAME"), resultSet.getInt("CID"));
                list.add(countryClass);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
