package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestController extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("TestController控制层类执行了");

        response.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.write("<html>");
        printWriter.write("<head>");
        printWriter.write("<meta charset=\"UTF-8\">");
        printWriter.write("</head>");
        printWriter.write("<body>");
        printWriter.write("这是通过TestController控制层动态添加的信息，返回的内容");
        printWriter.write("</body>");
        printWriter.write("</html>");
    }
}
