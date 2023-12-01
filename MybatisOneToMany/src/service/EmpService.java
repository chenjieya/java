package service;

import dao.EmpDao;
import domain.EmpClass;
import utils.MySpring;

public class EmpService {

    private EmpDao dao = MySpring.getBean("dao.EmpDao");

    public EmpClass selectOne(int empno) {
        return dao.selectOne(empno);
    }

}
