package service;

import dao.DeptDao;
import domain.Dept;
import utils.MySqlSession;

import java.util.List;

public class DeptService {

    private DeptDao deptDao = MySqlSession.getMapper(DeptDao.class, true);

    public Dept selectOne(Integer deptno) {
        return deptDao.selectOne(deptno);
    }

    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }

}
