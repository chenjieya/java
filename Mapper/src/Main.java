import domain.StudentClass;
import service.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        StudentService studentService = new StudentService();
        List<StudentClass> studentClasses = studentService.selectAll();

        StudentClass studentClass = new StudentClass(50, "test5");
        studentService.insert(studentClass);


        for (StudentClass item : studentClasses) {
            System.out.println(item);
        }


    }
}