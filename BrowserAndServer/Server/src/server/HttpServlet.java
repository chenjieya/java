package server;

import domain.HttpServletRequest;
import domain.HttpServletResponse;

public abstract class HttpServlet {

    public  abstract void server(HttpServletRequest request, HttpServletResponse response);

}
