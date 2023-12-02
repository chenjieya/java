package service;

import dao.DeptDao;
import dao.EmpDao;
import domain.DeptClass;
import utils.MySpring;

import java.util.List;

public class DeptService {

    private DeptDao dao = MySpring.getBean("dao.DeptDao");

    public DeptClass selectOne(int deptno) {
        return dao.selectOne(deptno);
    }

    public List<DeptClass> selectAll() {
        return dao.selectAll();
    }

}
