import domain.DeptClass;
import domain.EmpClass;
import service.DeptService;
import service.EmpService;
import utils.MySpring;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        EmpService empService = MySpring.getBean("service.EmpService");
//
//        EmpClass empClass = empService.selectOne(7698);
//
//        System.out.println(empClass);
//
//        List<EmpClass> empClasses = empService.selectAll();
//
//        for (EmpClass item : empClasses) {
//            System.out.println(item+" ~~~~ ");
//        }

        DeptService deptService = MySpring.getBean("service.DeptService");
        DeptClass deptClass = deptService.selectOne(10);
        System.out.println(deptClass);
    }
}