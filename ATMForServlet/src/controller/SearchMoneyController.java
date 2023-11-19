package controller;

import service.AtmSearchServer;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class SearchMoneyController extends HttpServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // 设置 将字节按照指定编码转换为字符串
        request.setCharacterEncoding("utf-8");

        // 获取到用户传递过来的名字
        String username = request.getParameter("aname");

        // 调用业务层
        AtmSearchServer atmservice = MySpring.getBean("service.AtmSearchServer");
        Float money = atmservice.search(username);

        response.setCharacterEncoding("utf-8");
        PrintWriter printWriter = response.getWriter();

        printWriter.write("<!DOCTYPE html>");
        printWriter.write("<html lang=\"en\">");
        printWriter.write("<head>");
        printWriter.write("<meta charset=\"UTF-8\">");
        printWriter.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        printWriter.write(" <title>Document</title>");
        printWriter.write("</head>");
        printWriter.write("<body>");
        printWriter.write("尊敬的"+username+"用户，你的账号余额为"+money+"");
        printWriter.write("</body>");
        printWriter.write("</html>");
    }
}
