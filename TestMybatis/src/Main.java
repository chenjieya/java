import dao.StudentDao;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 测试mybatis新增
        StudentDao studentDao = new StudentDao();
        studentDao.insert();
    }
}