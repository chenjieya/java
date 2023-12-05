package service;

import dao.StudentDao;
import domain.StudentClass;
import utils.MySqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {

    private StudentDao studentDao = MySqlSession.getMapper(StudentDao.class, true);

    // 新增学生
//    public void insert(StudentClass student) {
//        studentDao.insert(student);
//    }

//    public void insert(Integer sid, String sname) {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("sid",sid);
//        map.put("sname",sname);
//        studentDao.insert(map);
//    }

    public void insert(Integer sid, String sname) {
        studentDao.insert(sid, sname);
    }

    // 修改学生
    public void update(StudentClass student) {
        studentDao.update(student);
    }

    // 删除学生
    public void delete(Integer sid) {
        studentDao.delete(sid);
    }


    // 查询
    public StudentClass selecta(Integer sid) {
        return studentDao.selecta(sid);
    }

    public List<StudentClass> selectAll() {
        return studentDao.selectAll();
    }

    public Map selectCount() {
        return studentDao.selectCount();
    }


}
