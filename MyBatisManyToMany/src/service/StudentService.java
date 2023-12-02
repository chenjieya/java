package service;

import dao.StudentDao;
import domain.StudentClass;
import utils.MySpring;

import java.util.List;

public class StudentService {

    private StudentDao studentDao = MySpring.getBean("dao.StudentDao");

    public StudentClass selectOne(int sid) {
        return studentDao.selectOneByStudent(sid);
    }

    public List<StudentClass> selectAll() {
        return studentDao.selectOneByStudentAll();
    }

}
