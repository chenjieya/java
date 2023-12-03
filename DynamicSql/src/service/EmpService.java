package service;

import dao.EmpDao;
import domain.EmpClass;
import utils.MySpring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpService {

    private EmpDao dao = MySpring.getBean("dao.EmpDao");

    public List<String> selectJob() {
        return dao.selectJob();
    }

    public List<Integer> selectDeptno() {
        return dao.selectDeptno();
    }


    public List<EmpClass> selectEmp(Integer deptno, String job, String orderby) {
        Map<String, Object> data = new HashMap<>();
        data.put("deptno", deptno);
        data.put("job", job);
        data.put("orderby", orderby);
        return dao.selectEmp(data);
    }


}
