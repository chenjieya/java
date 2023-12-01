import domain.Person;
import service.PersonService;
import utlis.MySpring;

public class Main {
    public static void main(String[] args) {

        PersonService service = MySpring.getBean("service.PersonService");

        Person person = service.selectOne(1);
        System.out.println(person);
    }
}