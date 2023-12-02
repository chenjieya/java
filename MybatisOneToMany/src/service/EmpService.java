package service;

import dao.EmpDao;
import domain.EmpClass;
import utils.MySpring;

import java.util.List;

public class EmpService {

    private EmpDao dao = MySpring.getBean("dao.EmpDao");

    public EmpClass selectOne(int empno) {
        return dao.selectOne(empno);
    }

    public List<EmpClass> selectAll() {
        return dao.selectAll();
    }

}
