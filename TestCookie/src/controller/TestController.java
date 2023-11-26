package controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String param = request.getParameter("param");

        Cookie[] cookies = request.getCookies();

        for (Cookie cookie: cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();

            System.out.println(name+"---------"+value);
        }

    }
}
