package service;

import dao.StudentDao;
import dao.TeacherDao;
import domain.TeacherClass;
import utils.MySpring;

import java.util.List;

public class TeacherService {

    private TeacherDao teacherDao = MySpring.getBean("dao.TeacherDao");

    public TeacherClass selectOne(int tid) {
        return teacherDao.selectOne(tid);
    }

    public List<TeacherClass> selectAll() {
        return teacherDao.selectAll();
    }

}
