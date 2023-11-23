package controller;

import domain.ProductClass;
import service.ProductService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Integer cid = Integer.parseInt(request.getParameter("cid"));

        // 调用服务层
        ProductService bean = (ProductService)MySpring.getBean("service.ProductService");
        ArrayList<ProductClass> productArr = bean.showProductByCid(cid);

        request.setAttribute("productArr", productArr);
        request.getRequestDispatcher("product.jsp").forward(request,response);
    }
}
