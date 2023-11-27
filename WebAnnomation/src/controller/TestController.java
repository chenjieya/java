package controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = "/test",
        loadOnStartup = 0,
        initParams = {
            @WebInitParam(name = "zhangsan", value = "333"),
            @WebInitParam(name = "wangwu", value = "555")
        }
)
public class TestController extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("TestController init");

        Enumeration<String> initParameterNames = config.getInitParameterNames();

        while (initParameterNames.hasMoreElements()) {
            String key = initParameterNames.nextElement();
            String val = config.getInitParameter(key);

            System.out.println(key+ ":" + val);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TestController doGet");
    }
}
