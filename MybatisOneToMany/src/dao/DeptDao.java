package dao;

import domain.DeptClass;
import org.apache.ibatis.session.SqlSession;
import utils.MySqlSession;

import java.util.List;

public class DeptDao {

    private SqlSession sqlSession = MySqlSession.getSqlSession(true);

    public DeptClass selectOne(int deptno) {
        return sqlSession.selectOne("selectOneByDept", deptno);
    }

    public List<DeptClass> selectAll() {
        return sqlSession.selectList("selectAllByDept");
    }

}
