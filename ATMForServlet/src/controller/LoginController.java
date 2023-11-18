package controller;

import service.AtmLogin;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 浏览器是按照UTF-8拆分字符集传递过来的，我们要按照UTF-8的字符集去组合
        request.setCharacterEncoding("utf-8");


        // 得到账号和密码
        String user =request.getParameter("username");
        String pwd = request.getParameter("password");

        // 需要业务层处理逻辑
        AtmLogin atm = MySpring.getBean("service.AtmLogin");
        String result = atm.login(user, pwd);

        System.out.println("校验结果：");
        System.out.println(user+"-"+pwd);
        System.out.println(result);

    }
}
