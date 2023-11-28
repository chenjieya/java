package service;

import dao.AreaDao;
import domain.AreaClass;
import utils.MySpring;

import java.util.ArrayList;

public class AreaService {

    private AreaDao dao = MySpring.getBean("dao.AreaDao");

    public ArrayList<AreaClass> getArea(String cid) {
        ArrayList<AreaClass> areaClasses = dao.selectAreaByCountry(cid);

        return areaClasses;
    }

}
