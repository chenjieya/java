package controller;

import service.AtmService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        // 获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // 调用服务层
        String result = new AtmService().login(username, password);


        if (result.equals("登录成功")) {
            // 存储一下名字
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // 设置失活时间
            session.setMaxInactiveInterval(10);  // 10秒

            // 转发
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        } else {
            // 回到首页，将错误消息带回去
            request.setAttribute("result", result);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }




    }
}
