package dao;

import domain.EmpClass;
import org.apache.ibatis.session.SqlSession;
import utils.MySqlSession;

import java.util.List;
import java.util.Map;

public class EmpDao {

    private SqlSession sqlSession = MySqlSession.getSqlSession(true);


    public List<String> selectJob() {
        return sqlSession.selectList("selectAllJob");
    }

    public List<Integer> selectDeptno() {
        return sqlSession.selectList("selectAllDeptno");
    }

    public List<EmpClass> selectEmp(Map<String,Object> dataMap) {
        return sqlSession.selectList("selectAllList",dataMap);
    }

}
