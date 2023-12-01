package service;

import dao.StudentDao;
import domain.StudentClass;
import utils.MySpring;

import java.util.List;

public class StudentService {

    private StudentDao studentDao = MySpring.getBean("dao.StudentDao");
    public void insert(StudentClass student) {
        studentDao.insert(student);
    }

    public void delete(int id) {
        studentDao.delete(id);
    }

    public void update(StudentClass student) {
        studentDao.update(student);
    }

    public StudentClass selectOne(int id) {
       return studentDao.selectOne(id);
    }

    public List<StudentClass> selectAll() {
        return studentDao.selectAll();
    }

}
