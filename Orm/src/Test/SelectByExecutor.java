package Test;

import Dao.CarDao;

public class SelectByExecutor {

    public static void main(String[] args) {

        CarDao dao = new CarDao();
        dao.selectCountByExecutor();

        dao.selectMapByExecutor();

        dao.selectAllByExecutor();

    }

}
