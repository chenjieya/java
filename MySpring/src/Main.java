import MySpring.MySpring;
import MySpring.Person;
import MySpring.Question;

public class Main {
    public static void main(String[] args) {
        // IOC对象反转控制
        MySpring ms = new MySpring();
        Person p = (Person)ms.getBean("MySpring.Person");
        System.out.println(p);
    }
}