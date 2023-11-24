package controller;

import domain.UserClass;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class TestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String strval = "abcdefg";
        request.setAttribute("strval", strval);

        int value = 10;

        request.setAttribute("value", value);

        ArrayList<UserClass> userObjArr = new ArrayList<>();

        userObjArr.add(new UserClass("陈杰", "6666"));
        userObjArr.add(new UserClass("alvis", "8888"));


        request.setAttribute("userList", userObjArr);

        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}
