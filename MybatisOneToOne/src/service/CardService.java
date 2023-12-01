package service;

import dao.CardDao;
import dao.PersonDao;
import domain.CardID;
import domain.Person;
import utlis.MySpring;

import java.util.List;

public class CardService {

    private CardDao cardDao = MySpring.getBean("dao.CardDao");

    // 根据身份证查找身份证和人的信息
    public CardID selectOne(String cardid) {
        return cardDao.selectOne(cardid);
    }

    public List<CardID> selectAll() {
        return cardDao.selectAll();
    }
}
