import dao.StudentDao;
import domain.StudentClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 测试mybatis新增
        StudentDao studentDao = new StudentDao();
//        studentDao.insert();

//        studentDao.selectOne();


//        List<StudentClass> studentClasses = studentDao.selectAll();
//
//        for (StudentClass studentClass : studentClasses) {
//            System.out.println(studentClass);
//        }


//        studentDao.selectCount();

//        studentDao.selectNameById(6);

//        List<Map<String, Object>> maps = studentDao.selectSexCount();
//
//        for (Map<String, Object> item : maps) {
//            System.out.println(item);
//        }
//        StudentClass studentClass = new StudentClass();
//        studentClass.setS_id(4);
//        studentClass.setS_name("alvis_pluse");
//        studentDao.update(studentClass);

//        Map<String, Object> map = new HashMap<>();
//        map.put("s_sex", "nv");
//        map.put("s_id", 6);
//        studentDao.updateMap(map);
//
//        studentDao.selectNameById(6);

        List<StudentClass> studentClasses = studentDao.selectOrder("desc");

        for (StudentClass item : studentClasses) {
            System.out.println(item);
        }

    }
}