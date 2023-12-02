import domain.StudentClass;
import domain.TeacherClass;
import service.StudentService;
import service.TeacherService;
import utils.MySpring;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//
//        StudentService studentService = MySpring.getBean("service.StudentService");
//
//        StudentClass studentClass = studentService.selectOne(20);
//
//        System.out.println(studentClass);
//
//        List<StudentClass> studentClasses = studentService.selectAll();
//
//        for (StudentClass item : studentClasses) {
//            System.out.println(item + " ~~~~~~ ");
//        }


        TeacherService teacherService = MySpring.getBean("service.TeacherService");
        TeacherClass teacherClass = teacherService.selectOne(1);

        System.out.println(teacherClass);


        List<TeacherClass> teacherClasses = teacherService.selectAll();
        for (TeacherClass item : teacherClasses) {
            System.out.println(item + " ~~~~~~ ");
        }

    }
}