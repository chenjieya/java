package controller;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class DepositController extends HttpServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        // 获取参数
        String username = request.getParameter("aname");

        // 返回结构
        response.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();

        writer.write("<!DOCTYPE html>");
        writer.write("<html lang=\"en\">");
        writer.write("<head>");
        writer.write("<meta charset=\"UTF-8\">");
        writer.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        writer.write("<title>Document</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<form action=\"submitSave\" method=\"post\">");
        writer.write("<div>尊敬的用户，请输入存款金额：<input type=\"text\" name=\"money\" value=\"\"></div>");
        writer.write("<input type=\"text\" name=\"aname\" value=\""+username+"\" hidden>");
        writer.write("<input type=\"submit\" name=\"提交\" id=\"submit\">");
        writer.write("</form>");
        writer.write("</body>");
        writer.write("</html>");

        writer.flush();
    }
}
