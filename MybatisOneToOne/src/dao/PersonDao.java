package dao;

import domain.Person;
import org.apache.ibatis.session.SqlSession;
import utlis.MySqlsession;

public class PersonDao {

    private SqlSession sqlSession = MySqlsession.getSqlSession(true);

    public Person selectOne(int pid) {
        return (Person) sqlSession.selectOne("selectOne", pid);
    }

}
