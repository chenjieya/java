import domain.Dept;
import domain.Emp;
import domain.Person;
import domain.StudentClass;
import service.DeptService;
import service.EmpService;
import service.PersonCardService;
import service.StudentService;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
//        studentService.insert(new StudentClass(1,"111"));
//        studentService.insert(2,"222");
//        studentService.insert(3,"333");

//        studentService.update(new StudentClass(1,"一一一"));

//        studentService.delete(1);

//        StudentClass select = studentService.selecta(2);
//        System.out.println(select);

//        List<StudentClass> studentClasses = studentService.selectAll();
//
//        for (StudentClass item : studentClasses) {
//            System.out.println(item);
//        }

//        Map map = studentService.selectCount();
//        System.out.println(map);

//        PersonCardService service = new PersonCardService();
//        Person person = service.selectByPerson(1);
//        System.out.println(person);

//        List<Person> selectAll = service.selectAll();
//        for (Person item : selectAll) {
//            System.out.println(item);
//        }

        EmpService service = new EmpService();

        // 通过传递job、deptno查询结果
//        List<Emp> emps = service.selectBySearch("SALESMAN", 300F);
//
//        for (Emp item : emps) {
//            System.out.println(item);
//        }

        /**
         * 7499
         * 7521
         * 7788
         */
        List<Emp> emps = service.selectBySearchEmpNo(7499,7521,7788);

        for (Emp item : emps) {
            System.out.println(item);
        }


//        Emp emp = service.selectOne(7369);
//        System.out.println(emp);

//        List<Emp> emps = service.selectAll();
//        for (Emp item : emps) {
//            System.out.println(item);
//        }

//        DeptService deptService = new DeptService();
//        Dept dept = deptService.selectOne(10);
//        System.out.println(dept);

//        List<Dept> depts = deptService.selectAll();
//
//        for (Dept item : depts) {
//            System.out.println(item);
//        }

    }
}