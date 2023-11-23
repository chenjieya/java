package controller;

import service.RegisterService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistercController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 调服务层
        RegisterService registerService = MySpring.getBean("service.RegisterService");
        // 调用注册方法
        String register = registerService.register(username, password);

        request.setAttribute("register", register);
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
