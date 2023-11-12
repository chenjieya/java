import Dao.EmpLikeDao;
import Domain.Emp;
import Server.EmpServer;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
//        EmpLikeDao dao = new EmpLikeDao();
//        ArrayList<Emp> res = dao.searchLike("B");

        EmpServer result = new EmpServer();
        ArrayList<Emp> res = result.searchPage(2);

        for (Emp list:res) {
            System.out.println(list);
        }
    }
}