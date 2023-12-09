import domain.StudentDomain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = (JdbcTemplate)factory.getBean("jdbcTemplate");

        // 新增
        // String sql = "INSERT INTO STUDENT VALUES (?,?)";
        // template.update(sql, 60, "abc");

        // 修改
        // String sql = "UPDATE STUDENT SET SNAME = ? WHERE SID = ?";
        // template.update(sql, "abcd", 60);

        // 查询
        // 一个列
        String sql = "SELECT SNAME FROM STUDENT WHERE SID = ?";
        String s = template.queryForObject(sql, String.class, 60);
        System.out.println(s);  // abcd


        // 查询一行
        String sqlRow = "SELECT * FROM STUDENT WHERE SID = ?";
        StudentDomain stu = template.queryForObject(sqlRow, new RowMapper<StudentDomain>() {
            @Override
            public StudentDomain mapRow(ResultSet resultSet, int i) throws SQLException {
                StudentDomain studentDomain = new StudentDomain();
                studentDomain.setSid(resultSet.getInt("sid"));
                studentDomain.setSname(resultSet.getString("sname"));
                return studentDomain;
            }
        }, 60);

        System.out.println(stu);

        // 查询多行  List<Map<String,Object>> 这样还得造型
        String sqls = "SELECT * FROM STUDENT";
        List<Map<String, Object>> maps = template.queryForList(sqls);
        System.out.println(maps);


        // 查询多行
        List<StudentDomain> list = template.query(sqls, new RowMapper<StudentDomain>() {
            @Override
            public StudentDomain mapRow(ResultSet resultSet, int i) throws SQLException {
                StudentDomain studentDomain = new StudentDomain();
                studentDomain.setSid(resultSet.getInt("sid"));
                studentDomain.setSname(resultSet.getString("sname"));
                return studentDomain;
            }
        });

        System.out.println(list);

    }
}