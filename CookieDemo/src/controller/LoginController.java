package controller;

import service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null && password == null) {
            Cookie[] cookies = request.getCookies();

            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();

                if (name.equals("username") && value != null){
                    username = value;
                }

                if (name.equals("password")&& value!=null) {
                    password = value;
                }

            }
        }

        LoginService loginService = new LoginService();
        String login = loginService.login(username, password);


        if (login.equals("登陆成功")) {
            String[] remembers = request.getParameterValues("remember");
            // 记住密码
            if (remembers != null && remembers.length > 0) {
                // 1. 放到cookie中
                Cookie user = new Cookie("username", username);
                Cookie pwd = new Cookie("password", password);

                // 2. 设置cookie时间
                user.setMaxAge(20);  // 20秒
                pwd.setMaxAge(20);

                // 3. 交给浏览器，让浏览器存储在cookie中
                response.addCookie(user);
                response.addCookie(pwd);
            }

            request.getRequestDispatcher("welcome.jsp").forward(request,response);
        } else{
            // 登录失败
            request.setAttribute("result", login);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }


    }
}
