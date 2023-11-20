package controller;

import service.AtmSearchServer;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchMoneyController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("SearchMoneyController对象创建了");
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置 将字节按照指定编码转换为字符串(这是get请求，也可以不设置字符集)
        request.setCharacterEncoding("utf-8");

        // 获取到用户传递过来的名字
        String username = request.getParameter("aname");

        // 调用业务层
        AtmSearchServer atmservice = MySpring.getBean("service.AtmSearchServer");
        Float money = atmservice.search(username);

        request.setAttribute("money", money);  // 设置值。

        request.getRequestDispatcher("showBalance.jsp").forward(request,response);

    }
}
