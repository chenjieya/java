package dao;

import domain.StudentClass;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import utils.MySqlsession;

import java.util.List;

public class StudentDao {

    private SqlSession sqlSession = MySqlsession.getSqlSession(true);
    public void insert(StudentClass student) {
        sqlSession.insert("insert", student);
    }

    public void delete(int id) {
        sqlSession.delete("delete", id);
    }

    public void update(StudentClass student) {
        sqlSession.update("update", student);
    }

    public StudentClass selectOne(int id) {
        return (StudentClass)sqlSession.selectOne("selectOne", id);
    }

    public List<StudentClass> selectAll() {
        List<StudentClass> selectAll = sqlSession.selectList("selectAll");
        return selectAll;
    }


}
