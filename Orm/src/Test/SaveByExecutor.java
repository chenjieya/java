package Test;

import Dao.CarDao;
import Domain.CarClass;

import java.util.ArrayList;

public class SaveByExecutor {
    public static void main(String[] args) {

        ArrayList<CarClass> list = new ArrayList<>();
        list.add(new CarClass(null, "BYD1", "FFF", 400.0));
        list.add(new CarClass(null, "BYD2", "000", 500.0));
        list.add(new CarClass(null, "BYD", "DDD", 600.0));

        CarDao cd = new CarDao();
        // cd.saveByExecutor(car);

        cd.savesByExecutor(list);
    }
}
