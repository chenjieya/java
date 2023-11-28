package controller;

import domain.CountryClass;
import service.CountryService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/selectCountry")
public class CountryController extends HttpServlet {

    private CountryService countryService = MySpring.getBean("service.CountryService");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        System.out.println("CountryController");

        // 服务层
        ArrayList<CountryClass> countryClasses = countryService.selectCountry();

        request.setAttribute("country", countryClasses);

        request.getRequestDispatcher("/register.jsp").forward(request, response);

    }
}
