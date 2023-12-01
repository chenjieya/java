package dao;

import domain.CardID;
import org.apache.ibatis.session.SqlSession;
import utlis.MySqlsession;

import java.util.List;

public class CardDao {

    private SqlSession sqlSession = MySqlsession.getSqlSession(true);

    public CardID selectOne(String cardId) {
        CardID selectOne = sqlSession.selectOne("selectOneCard", cardId);
        return selectOne;
    }

    public List<CardID> selectAll() {
        List<CardID> selectAll = sqlSession.selectList("selectAllCard");
        return selectAll;
    }

}
