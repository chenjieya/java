package controller;

import domain.AtmClass;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应组合字符集
//        request.setCharacterEncoding("utf-8");
//
//        // 获取参数
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String abalance = request.getParameter("abalance");
//
//        AtmClass atmClass = new AtmClass();
//        atmClass.setAname(username);
//        atmClass.setApassword(password);
//        atmClass.setAbalance(Float.parseFloat(abalance));


        // 接受前面传递的参数
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String key = parameterNames.nextElement();
            String val = request.getParameter(key);
            System.out.println(key + ":" + val);
        }


        // 接受前面那个创建好的vo对象
        AtmClass atm = (AtmClass) request.getAttribute("atm");

        System.out.println(atm);

        /**
         * 调用Service服务层处理逻辑
         *  Service会调用Dao来读取数据库中的数据
         *  Dao会调用domain来存储数据
         */


        // jsp转发
        // request.getRequestDispatcher("register_success.jsp").forward(request, response);

        // 重定向
        response.sendRedirect("login.jsp");
    }
}
