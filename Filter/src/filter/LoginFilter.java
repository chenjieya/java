package filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter extends HttpFilter {


    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Hellow 我是Filter");

        String requestURI = request.getRequestURI();

        if (requestURI.contains("index")||requestURI.contains("login")) {
            chain.doFilter(request,response);
        } else{
            // 每走一个接口都需要验证一下身份
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");

            if (username != null) {
                // 用户正在登录(放行)
                chain.doFilter(request, response);
            } else{
                // 用户登录失效。或者未登录
                request.setAttribute("result", "登录已超时，请重新登录");
                request.getRequestDispatcher("index.jsp").forward(request,response);
            }
        }



        // 放行
        // chain.doFilter(request, response);
    }
}
