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

        response.setCharacterEncoding("utf-8");
        PrintWriter printWriter = response.getWriter();

        printWriter.write("<!DOCTYPE html>");
        printWriter.write("<html lang=\"en\">");
        printWriter.write("<head>");
        printWriter.write("<meta charset=\"UTF-8\">");
        printWriter.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        printWriter.write(" <title>Document</title>");
        printWriter.write("<script>");
        printWriter.write("window.onload = function(){");
        printWriter.write("document.getElementById(\"back\").onclick = function(){");
        printWriter.write("window.history.back();");
        printWriter.write("}");
        printWriter.write("}");
        printWriter.write("</script>");

        printWriter.write("</head>");
        printWriter.write("<body>");
        printWriter.write("尊敬的"+username+"用户存款成功");
        printWriter.write("<input type=\"button\" id=\"back\" value=\"返回\">");
        printWriter.write("</body>");
        printWriter.write("</html>");

    }
}
