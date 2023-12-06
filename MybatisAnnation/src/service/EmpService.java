package service;

import dao.EmpDao;
import domain.Emp;
import utils.MySqlSession;

import java.util.List;

public class EmpService {

    private EmpDao empDao = MySqlSession.getMapper(EmpDao.class, true);

    public Emp selectOne(Integer empno) {
        return empDao.selectOne(empno);
    }

    public List<Emp> selectAll() {
        return empDao.selectAll();
    }

    // 通过传递job、deptno查询结果
    public List<Emp> selectBySearch(String job, Float comm) {
        return empDao.selectBySearch(job,comm);
    }

}
