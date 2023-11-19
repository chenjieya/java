package controller;

import service.AtmLogin;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 浏览器是按照UTF-8拆分字符集传递过来的，我们要按照UTF-8的字符集去组合
        request.setCharacterEncoding("utf-8");


        // 得到账号和密码
        String user =request.getParameter("username");
        String pwd = request.getParameter("password");

        // 需要业务层处理逻辑
        AtmLogin atm = MySpring.getBean("service.AtmLogin");
        String result = atm.login(user, pwd);

        // 将最后的结果通过Response对象返回给浏览器
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

        if(result.equals("登录成功")) {
            printWriter.write("<div>****************************</div>");
            printWriter.write("<div>欢迎尊贵的"+user+"用户登陆我行系统</div>");
            printWriter.write("<div>****************************</div>");


            printWriter.write("<div><a href=\"searchMoney?aname="+user+"\">查询余额</a></div>");
            printWriter.write("<div><a href=\"\">存款</a></div>");


        } else{
            printWriter.write("<h2>对不起，登陆失败，请重新登陆</h2>");
        }

        printWriter.write("</body>");
        printWriter.write("</html>");


    }
}
