package controller;

import com.alibaba.fastjson.JSONObject;
import domain.AreaClass;
import service.AreaService;
import utils.MySpring;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/area")
public class AreaController extends HttpServlet {

    private AreaService areaService = MySpring.getBean("service.AreaService");

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        String cid = request.getParameter("cid");

        System.out.println(cid+": AreaController");

        ArrayList<AreaClass> area = areaService.getArea(cid);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("areaList", area);
        System.out.println(jsonObject.toJSONString());

        response.setCharacterEncoding("utf-8");
        response.getWriter().write(jsonObject.toJSONString());


    }
}
