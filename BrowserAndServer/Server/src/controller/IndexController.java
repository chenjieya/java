package controller;

import domain.HttpServletRequest;
import domain.HttpServletResponse;
import server.HttpServlet;

public class IndexController extends HttpServlet {

    public void server(HttpServletRequest request, HttpServletResponse response) {
        // 获取到请求过来的信息
        // 找到某一个业务层的方法做事情

        // 将最终业务层执行完毕的方法返回出去 让服务器返回给浏览器

        // 去文件中读取，将读取的内容返回给浏览器
        // response.write("****银行系统****<br />");
        // response.write("****欢迎登录****<br />");
        // response.write("请输入账号<br />");
        // response.write("请输入密码<br />");

        response.readFileContent("index.view");
    }
}
