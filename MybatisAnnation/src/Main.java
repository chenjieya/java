import domain.Person;
import domain.StudentClass;
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

        PersonCardService service = new PersonCardService();
//        Person person = service.selectByPerson(1);
//        System.out.println(person);

        List<Person> selectAll = service.selectAll();
        for (Person item : selectAll) {
            System.out.println(item);
        }

    }
}