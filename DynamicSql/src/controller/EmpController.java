package controller;

import com.alibaba.fastjson.JSONObject;
import service.EmpService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@WebServlet("/serachList")
public class EmpController extends HttpServlet {

    private EmpService empService = MySpring.getBean("service.EmpService");

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> strings = empService.selectJob();
        List<Integer> integers = empService.selectDeptno();

        JSONObject json = new JSONObject();
        json.put("jobList", strings);
        json.put("deptnoList", integers);

        response.setCharacterEncoding("utf-8");
        response.getWriter().write(json.toJSONString());

    }
}
