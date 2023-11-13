package Test;

import Dao.CarDao;
import Domain.CarClass;

import java.util.ArrayList;

public class SaveAll {

    public static void main(String[] args) {

        ArrayList<CarClass> list = new ArrayList<>();
        list.add(new CarClass(null, "BYD1", "Black", 4000.0));
        list.add(new CarClass(null, "BYD2", "Black", 4000.0));
        list.add(new CarClass(null, "BYD", "Black", 4000.0));


        CarDao cd = new CarDao();
        cd.insertAll(list);

    }
}
