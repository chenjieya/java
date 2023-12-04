package service;

import dao.StudentDao;
import domain.StudentClass;
import utils.MySpring;
import utils.MySqlSession;

import java.util.List;

public class StudentService {

    private StudentDao studentDao = MySqlSession.getSqlSession(true).getMapper(StudentDao.class);

    public void insert(StudentClass student) {
        studentDao.insert(student);
    }

    public void delete(Integer sid) {
        studentDao.delete(sid);
    }

    public void update(StudentClass student) {
        studentDao.update(student);
    }

    public StudentClass selectOne(Integer sid) {
        return studentDao.selectOne(sid);
    }

    public List<StudentClass> selectAll() {
        return studentDao.selectAll();
    }

}
