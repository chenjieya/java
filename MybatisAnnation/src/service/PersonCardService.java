package service;

import dao.PersonCardDao;
import domain.Person;
import utils.MySqlSession;

import java.util.List;

public class PersonCardService {

    private PersonCardDao personCardDao = MySqlSession.getMapper(PersonCardDao.class, true);

    public Person selectByPerson(Integer pid) {
        return personCardDao.selectByPerson(pid);
    }

    public List<Person> selectAll() {
        return personCardDao.selectAll();
    }

}
