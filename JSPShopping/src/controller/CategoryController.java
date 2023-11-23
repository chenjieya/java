package controller;

import domain.CategoryClass;
import service.CategoryService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class CategoryController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 调用服务层
        CategoryService bean = (CategoryService)MySpring.getBean("service.CategoryService");

        ArrayList<CategoryClass> catergoryArr = bean.showSelectCategory();

        request.setAttribute("categoryArr", catergoryArr);

        request.getRequestDispatcher("category.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
