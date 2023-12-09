package controller;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.StudentService;

import java.util.List;

@Controller("studentController")
public class StudentController {

    private StudentService studentService;

    public StudentController() {
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> test(String sname) {
        return studentService.test(sname);
    }

}
