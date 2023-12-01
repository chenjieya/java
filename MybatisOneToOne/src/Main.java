import domain.CardID;
import domain.Person;
import service.CardService;
import service.PersonService;
import utlis.MySpring;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonService service = MySpring.getBean("service.PersonService");

//        Person person = service.selectOne(1);
//        System.out.println(person);

        List<Person> selectAll = service.selectAll();
        for (Person item : selectAll) {
            // 我用到的都是Person的属性和方法，并没有使用Card的。这个时候为了提高效率，使用懒加载
            System.out.println(item.getPname());
            System.out.println(item.getPid());
        }
        System.out.println("=================================");

        CardService cardService = MySpring.getBean("service.CardService");

        cardService.selectOne("100000000000000006");
        List<CardID> cardIDS = cardService.selectAll();
        for (CardID item : cardIDS) {
            System.out.println(item);
        }
    }
}