import dao.PropertiesDao;
import domain.Computer;
import domain.Room;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Enumeration;
import java.util.Properties;

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
//        StudentController controllers = (StudentController) factory.getBean("controllerObj");
//
//        System.out.println(controllers);


//        Room room = (Room)factory.getBean("room");
//
//        Integer roomId = room.getRoomId();
//        String rname = room.getRname();
//        String[] ids = room.getIds();
//        Computer[] computers = room.getComputers();
//        System.out.println(roomId);
//        System.out.println("====================================");
//        System.out.println(rname);
//        System.out.println("====================================");
//        for (String item : ids) {
//            System.out.println(item);
//        }
//        System.out.println("====================================");
//        for (Computer computer : computers) {
//            System.out.println(computer);
//        }

//        PropertiesDao dao = (PropertiesDao)factory.getBean("testProperties");
//
//        Properties properties = dao.getProperties();
//
//        Enumeration<?> enumeration = properties.propertyNames();
//
//        while (enumeration.hasMoreElements()) {
//            String key = (String)enumeration.nextElement();
//            String value = properties.getProperty(key);
//            System.out.println(key + "=" + value);
//        }

        Room room = (Room)factory.getBean("room");

        String[] ids = room.getIds();
        for (String item : ids){
            System.out.println(item);
        }

        Computer[] computers = room.getComputers();
        for (Computer item : computers) {
            System.out.println(item);
        }


    }
}