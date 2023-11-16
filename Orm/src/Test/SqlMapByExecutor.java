package Test;

import Dao.CarDao;

public class SqlMapByExecutor {

    public static void main(String[] args) {
       CarDao cd = new CarDao();
       cd.sqlMapByExecutor();

       cd.sqlDomainByExecutor();
    }

}
