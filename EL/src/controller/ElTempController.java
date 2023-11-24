package controller;

import domain.UserClass;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ElTempController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 存储信息
        request.setAttribute("str", "测试EL表达式语言");

        request.setAttribute("userObj", new UserClass("张三", "sadasds"));


        HttpSession session = request.getSession();
        // 数组基本数据类型
        int[] arrInt = new int[]{1,2,3,4,5};
        session.setAttribute("arrInt",arrInt);

        // 数组里面放对象
        session.setAttribute("arrObj", new UserClass[]{new UserClass("chenjie", "aaa"), new UserClass("alvis", "3333")});

        // 二维数组
        session.setAttribute("arrTwo", new String[][]{{"abc", "ccc"},{"ddd", "eeee"}});



        request.getRequestDispatcher("showEl.jsp").forward(request,response);

    }
}
