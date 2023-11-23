package controller;

import service.LoginService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置字符集
        request.setCharacterEncoding("utf-8");

        // 获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username);
        System.out.println(password);

        LoginService loginService = MySpring.getBean("service.LoginService");
        String login = loginService.login(username, password);

        if (login.equals("登陆成功")){
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        } else{
            request.setAttribute("login", login);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }

    }
}
