package controller;

import service.AtmSearchServer;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class SubmitController extends HttpServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        // 获取参数
        String username = request.getParameter("aname");
        String money = request.getParameter("money");

        // 服务层

        AtmSearchServer service = MySpring.getBean("service.AtmSearchServer");

        service.updateMoney(username,Float.parseFloat(money));

        request.getRequestDispatcher("deposit.jsp").forward(request, response);
    }
}
