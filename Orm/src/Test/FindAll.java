package Test;

import Dao.CarDao;
import Domain.CarClass;

import java.util.ArrayList;

public class FindAll {
    public static void main(String[] args) {
        CarDao cd = new CarDao();
        ArrayList<CarClass> result =  cd.searchAll();
        for (CarClass carClass : result) {
            System.out.println(carClass);
        }
    }
}
