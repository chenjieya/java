package controller;

import domain.UserClass;
import service.AtmService;
import utils.MySpring;
import utils.ThreadHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    private AtmService atmService = MySpring.getBean("service.AtmService");

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String login = atmService.login(username, password);



        if (login.equals("登录成功")) {
            // 方案一：在service中设计一个查询方法(不好，明明已经查出了用户对象，该方法又去查询了一次)
            // String nickName = atmService.getNickName(username);
            // request.setAttribute("nickName", nickName);;

            // 方案三：
            ThreadLocal threadLocal = ThreadHandler.getThreadLocal(username);
            UserClass o = (UserClass)threadLocal.get();
            request.setAttribute("nickName", o.getNickname());

            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        } else {
            request.setAttribute("result", login);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }
}
