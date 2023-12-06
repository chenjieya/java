import domain.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        // 创建对象
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student)factory.getBean("student");
        System.out.println(stu);

    }
}