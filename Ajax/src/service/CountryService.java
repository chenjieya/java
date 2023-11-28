package service;

import dao.CountryDao;
import domain.CountryClass;
import utils.MySpring;

import java.util.ArrayList;

public class CountryService {

    private CountryDao dao = MySpring.getBean("dao.CountryDao");
    public ArrayList<CountryClass> selectCountry() {
        // 查询数据库
        ArrayList<CountryClass> countryClasses = dao.selectCountry();
        return countryClasses;
    }

}
