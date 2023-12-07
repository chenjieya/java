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

    public StudentService() {}

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void login() {
        System.out.println("service层的login->Dao层的函数");
        studentDao.loginDao();
    }

}
