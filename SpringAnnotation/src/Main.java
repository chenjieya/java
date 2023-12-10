import configClass.ConfigClass;
import configClass.MainClass;
import controller.StudentController;
import domain.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Main {
    public static void main(String[] args) {

//        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
//        StudentController controller = (StudentController)factory.getBean("studentController");
//        List<Student> test2 = controller.test("test2");
//
//        for (Student student : test2){
//            System.out.println(student);
//        }

//        Student stu = (Student)factory.getBean("student");
//        System.out.println(stu);
//        System.out.println(stu.getInter());

        BeanFactory factory = new AnnotationConfigApplicationContext(MainClass.class);
        StudentController controller = (StudentController)factory.getBean("studentController");
        List<Student> test2 = controller.test("test2");

        for (Student student : test2){
            System.out.println(student);
        }

        Student stu = (Student)factory.getBean("student");
        System.out.println(stu);
        System.out.println(stu.getInter());

    }
}