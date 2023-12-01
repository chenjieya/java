import domain.EmpClass;
import service.EmpService;
import utils.MySpring;

public class Main {
    public static void main(String[] args) {

        EmpService empService = MySpring.getBean("service.EmpService");

        EmpClass empClass = empService.selectOne(7698);

        System.out.println(empClass);
    }
}