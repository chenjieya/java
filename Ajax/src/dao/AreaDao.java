package dao;

import domain.AreaClass;
import domain.CountryClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AreaDao {

    private String drive = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/constrans";
    private String user = "root";
    private String pwd = "chenjie+00";


    public ArrayList<AreaClass> selectAreaByCountry(String cid) {

        ArrayList<AreaClass> list = null;

        try {
            Class.forName(this.drive);
            Connection connection = DriverManager.getConnection(this.url, this.user, this.pwd);

            String sql = "SELECT AID,ANAME,CID FROM AREA WHERE CID = ?";

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, cid);

            ResultSet resultSet = stmt.executeQuery();

            list = new ArrayList<>();

            while (resultSet.next()) {
                AreaClass areaClass = new AreaClass();
                areaClass.setAid(resultSet.getInt("aid"));
                areaClass.setAname(resultSet.getString("aname"));

                CountryClass countryClass = new CountryClass();
                countryClass.setCid(resultSet.getInt("cid"));

                areaClass.setCountryClass(countryClass);
                list.add(areaClass);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
