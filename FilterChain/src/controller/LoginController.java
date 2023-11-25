package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");

        // 获取参数

        // 调用服务层

        // 转发
        request.getRequestDispatcher("welcome.jsp").forward(request,response);

        // 重定向
        // response.sendRedirect("welcome.jsp");
    }
}
