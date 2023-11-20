package controller;

import service.AtmLogin;
import utils.MySpring;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class LoginController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("对象创建了");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        // config 用来读取配置文件中携带的信息的
        String key1 = config.getInitParameter("key1");
        System.out.println("读取到了配置文件中的init-param配置信息："+key1);

        /**
         * Properties pro = new Properties();
         * pro.load(new FileReader(""))
         * Enumeration en = pro.protertyNames()  获取全部的key
         */
        Enumeration<String> initParameterNames = config.getInitParameterNames();// 获取到所有的key

        while(initParameterNames.hasMoreElements()) {
            String s = initParameterNames.nextElement();  // key
            String res = config.getInitParameter(s);  // 获取到key对应的value
            System.out.println(res);
        }

        config.getServletName();  // 类名
        ServletContext applocation = config.getServletContext();// 全局上下文

    }

    @Override
    public void destroy() {
        // 以前修改xml文件就销毁了
        // v7.x之后，重新部署
        System.out.println("对象销毁了");
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 浏览器是按照UTF-8拆分字符集传递过来的，我们要按照UTF-8的字符集去组合
        request.setCharacterEncoding("utf-8");


        // 得到账号和密码
        String user =request.getParameter("username");  // zhangsan
        String pwd = request.getParameter("password");

        // 需要业务层处理逻辑
        AtmLogin atm = MySpring.getBean("service.AtmLogin");
        String result = atm.login(user, pwd);


        if(result.equals("登录成功")) {
            // 登录成功。跳转到welcaome.jsp
            // servlet 给Tomcat 转发到welcome.jsp
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome.jsp");// 该路径是从web开始的
            requestDispatcher.forward(request, response);  // 真正的转发

        } else{
             // 登录失败，控制响应信息是重新登录
            request.getRequestDispatcher("index.html").forward(request,response);
        }

    }
}
