package filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterChain extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, javax.servlet.FilterChain chain) throws IOException, ServletException {

        String requestURI = request.getRequestURI();

        System.out.println("Hello Filter :" + requestURI);

        chain.doFilter(request,response);

    }
}
