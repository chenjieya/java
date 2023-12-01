package service;

import dao.PersonDao;
import domain.Person;
import utlis.MySpring;

import java.util.List;

public class PersonService {

    private PersonDao personDao = MySpring.getBean("dao.PersonDao");

    // 根据人查找人和身份正的信息
    public Person selectOne(int pid) {
        return personDao.selectOne(pid);
    }

    public List<Person> selectAll() {
        return personDao.selectAll();
    }

}
