package service;

import dao.StudentDao;
import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService {

    private StudentDao studentDao;


    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentService() {
    }

    public List<Student> test(String sname) {
        return studentDao.findByName(sname);
    }

}
