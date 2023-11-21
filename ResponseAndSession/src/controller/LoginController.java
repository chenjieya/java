package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        // String username = request.getParameter("username");
        // String password = request.getParameter("password");

        // 转发
        // RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");
        // requestDispatcher.forward(request, response);


        // 重定向(直接返回给浏览器，然后浏览器在重新发送给服务器一个新的请求)
        response.sendRedirect("welcome.jsp");
    }
}
