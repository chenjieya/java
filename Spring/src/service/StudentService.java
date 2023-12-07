package service;

import dao.StudentDao;

public class StudentService {

    private StudentDao studentDao = new StudentDao();

    @Override
    public String toString() {
        return "StudentService{" +
                "studentDao=" + studentDao +
                '}';
    }

    public StudentService() {
        System.out.println("service无参数构造函数");
    }

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        System.out.println("service设置参数");
        this.studentDao = studentDao;
    }

    public void login() {
        System.out.println("service层的login->Dao层的函数");
        studentDao.loginDao();
    }

}
