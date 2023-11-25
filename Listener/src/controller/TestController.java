package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class TestController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("utf-8");

        String test = request.getParameter("test");


        request.setAttribute("abc", test);  // 设置值
        request.setAttribute("abc", "1231"); // 更改值
        request.removeAttribute("abc");  // 删除

        HttpSession session = request.getSession();

        session.setAttribute("ses", test);
        session.setAttribute("ses", "adsda");
        session.setMaxInactiveInterval(10);   // 注意这个不是销毁，这个时候不活跃

        session.invalidate();  // 销毁

    }
}
