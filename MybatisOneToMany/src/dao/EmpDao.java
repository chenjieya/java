package dao;

import domain.EmpClass;
import org.apache.ibatis.session.SqlSession;
import utils.MySqlSession;

public class EmpDao {

    private SqlSession sqlSession = MySqlSession.getSqlSession(true);

    public EmpClass selectOne(int empno) {
        return sqlSession.selectOne("selectOne", empno);
    }

}
