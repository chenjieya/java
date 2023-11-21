package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

public class RegisterController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        try {
            request.setCharacterEncoding("utf-8");
            String username = request.getParameter("username");
            String sex = request.getParameter("sex");
            System.out.println(username);
            System.out.println(sex);


            Enumeration<String> parameterNames = request.getParameterNames();// 获取到所有到key

            while(parameterNames.hasMoreElements()){
                String key = parameterNames.nextElement();
                String value = request.getParameter(key);
                System.out.println(key + ":" + value);
            }

            // 获取一个key对应的多个val
            String[] hobbies = request.getParameterValues("hobby");
            for (String hobby : hobbies){
                System.out.println(hobby);
            }

            // 获取url和uri
            StringBuffer requestURL = request.getRequestURL();
            String requestURI = request.getRequestURI();
            System.out.println(requestURL);
            System.out.println(requestURI);


        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }

}
