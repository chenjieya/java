package Test;

import Dao.CarDao;
import Domain.CarClass;

public class SqlSessionExecutor {
    public static void main(String[] args) {
        CarDao cd = new CarDao();
        cd.sqlSelectAllBySession();
        cd.sqlSelectOneBySession();
    }
}
