import Dao.EmpLikeDao;
import Domain.Emp;

import java.util.ArrayList;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EmpLikeDao dao = new EmpLikeDao();
        ArrayList<Emp> result = dao.innerSearch();

        for (Emp list:result) {
            System.out.println(list);
        }

        ArrayList<HashMap<String, Object>> res = dao.zidingyi();

        for (HashMap<String, Object> map:res) {
            System.out.println(map.get("deptno")+"----"+map.get("ct"));
        }

    }
}