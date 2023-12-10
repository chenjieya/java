package dao;

import configClass.MainClass;
import domain.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("studentDao")
public class StudentDao {


    public List<Student> findByName(String sname) {

        BeanFactory factory = new AnnotationConfigApplicationContext(MainClass.class);
        JdbcTemplate template = (JdbcTemplate) factory.getBean("jdbcTemplate");
        String sql = "SELECT * FROM student WHERE sname = ?";
        List<Student> result = template.query(sql, new RowMapper<Student>() {

            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student();
                student.setSid(resultSet.getInt("sid"));
                student.setSname(resultSet.getString("sname"));
                return student;
            }
        }, sname);
         return result;
    }

}
