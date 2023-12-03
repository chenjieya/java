package controller;

import com.alibaba.fastjson.JSONObject;
import domain.EmpClass;
import service.EmpService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectInfo")
public class EmpInfoController extends HttpServlet {

    private EmpService empService = MySpring.getBean("service.EmpService");

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String job = request.getParameter("job");

        String orderby = request.getParameter("orderby");
        Integer deptno = null;
        try {
            deptno =  Integer.parseInt(request.getParameter("deptno"));
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(job+"-----"+deptno+"-----"+orderby+"-----");


        List<EmpClass> empClasses = empService.selectEmp(deptno,job,orderby);

        JSONObject json = new JSONObject();
        json.put("data",empClasses);

        System.out.println(empClasses+"~~~~~~");
        System.out.println(json.toString());


        response.setCharacterEncoding("utf-8");

        response.getWriter().write(json.toJSONString());



    }
}
