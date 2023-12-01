import dao.StudentDao;
import domain.StudentClass;
import service.StudentService;
import utils.MySpring;

import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 新增
//        StudentClass studentClass = new StudentClass();
//        studentClass.setId(2);
//        studentClass.setSname("alvis");
//        studentClass.setSex("female");
//        studentClass.setCtime(new Date(System.currentTimeMillis()));
//
//        StudentService studentService = MySpring.getBean("service.StudentService");
//
//        studentService.insert(studentClass);


        // 删除
        StudentService studentService = MySpring.getBean("service.StudentService");
//        studentService.delete(2);

//        StudentClass studentClass = studentService.selectOne(2);
//        System.out.println(studentClass);
//
//        studentClass.setSex("male");
//        studentService.update(studentClass);

        List<StudentClass> studentClasses = studentService.selectAll();

        for (StudentClass item : studentClasses) {
            System.out.println(item);
        }
    }
}