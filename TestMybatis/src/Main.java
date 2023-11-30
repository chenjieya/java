import dao.StudentDao;
import domain.StudentClass;

import java.util.List;
import java.util.Map;

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

//        studentDao.selectNameById();

        List<Map<String, Object>> maps = studentDao.selectSexCount();

        for (Map<String, Object> item : maps) {
            System.out.println(item);
        }

    }
}