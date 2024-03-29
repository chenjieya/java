package dao;

import domain.Person;
import org.apache.ibatis.session.SqlSession;
import utlis.MySqlsession;

import java.util.List;

public class PersonDao {

    private SqlSession sqlSession = MySqlsession.getSqlSession(true);

    public Person selectOne(int pid) {
        return (Person) sqlSession.selectOne("selectOne", pid);
    }

    public List<Person> selectAll() {
        List<Person> selectAll = sqlSession.selectList("selectAll");
        return selectAll;
    }

}
