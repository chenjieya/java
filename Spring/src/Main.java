import controller.StudentController;
import domain.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        // 创建对象
//        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student stu = (Student)factory.getBean("student");
//        System.out.println(stu);


        // 写法一：重载
        //BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml", "applicationContext_dao.xml","applicationContext_controller.xml","applicationContext_service.xml");


        // 写法二：数组
        // BeanFactory factory = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml", "applicationContext_dao.xml","applicationContext_controller.xml","applicationContext_service.xml"});


        // 写法三：通配符
        //BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext*.xml");

        // 写法四：在基础xml配置文件中，直接引入其他文件

        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Student stu = (Student)factory.getBean("student");
//        System.out.println(stu);
        StudentController controller = (StudentController) factory.getBean("controller");

        System.out.println(controller);


    }
}