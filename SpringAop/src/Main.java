import controller.TestController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestController bean = (TestController)factory.getBean("testController");
        bean.test();
    }
}