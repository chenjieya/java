package controller;

import domain.ProductClass;
import service.ProductService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class saveProductController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String flag = request.getParameter("flag");
        String[] pids = request.getParameterValues("pid");

        ProductService bean = (ProductService)MySpring.getBean("service.ProductService");
        // 存储数据
//        ArrayList<ProductClass> selectedProduct = new ArrayList<>();
        HttpSession session = request.getSession();
        ArrayList<ProductClass> selectedProduct =(ArrayList<ProductClass>)session.getAttribute("selectedProduct");

        if (selectedProduct == null) {
            selectedProduct = new ArrayList<>();
            session.setAttribute("selectedProduct", selectedProduct);
        }

        for (String item:pids) {
            System.out.println(item+" :item");
            ProductClass productClass = bean.selectProductByPid(Integer.parseInt(item));
            selectedProduct.add(productClass);
        }

        if (flag.equals("继续购物")) {
            request.getRequestDispatcher("category").forward(request,response);
        } else{
            Float totalPrice = 0F;

            for (ProductClass item : selectedProduct) {
                totalPrice += item.getPrice();
            }
            request.setAttribute("totalPrice", totalPrice);

            request.getRequestDispatcher("order.jsp").forward(request,response);
        }

    }
}
