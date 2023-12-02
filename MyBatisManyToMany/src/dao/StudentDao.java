package dao;

import domain.StudentClass;
import org.apache.ibatis.session.SqlSession;
import utils.MySqlSession;

import java.util.List;

public class StudentDao {

    private SqlSession sqlSession = MySqlSession.getSqlSession(true);

    public StudentClass selectOneByStudent(int sid) {
        return sqlSession.selectOne("selectOneByStudent", sid);
    }

    public List<StudentClass> selectOneByStudentAll() {
        return sqlSession.selectList("selectOneByStudentAll");
    }

}
