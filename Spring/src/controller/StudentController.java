package controller;

import service.StudentService;

public class StudentController {

    private StudentService service = new StudentService();

    public StudentController() {
        System.out.println("controller无参数构造函数");
    }

    public StudentController(StudentService service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "service=" + service +
                '}';
    }

    public StudentService getService() {
        return service;
    }

    public void setService(StudentService service) {
        System.out.println("controler设置参数");
        this.service = service;
    }

    public void login() {
        System.out.println("控制层的login登录函数");

        service.login();
    }



}
