package dao;

import domain.TeacherClass;
import org.apache.ibatis.session.SqlSession;
import utils.MySqlSession;

import java.util.List;

public class TeacherDao {
    private SqlSession sqlSession = MySqlSession.getSqlSession(true);

    public TeacherClass selectOne(int tid) {
        return sqlSession.selectOne("selectOne", tid);
    }

    public List<TeacherClass> selectAll() {
        return sqlSession.selectList("selectAll");
    }
}
