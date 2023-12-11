package controller;


import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

// 将类交给Spring，但是要让Spring的配置文件，扫描到该注解
@Controller
// 请求路径
//@RequestMapping("testController.do")
public class TestController {

    // 请求执行方法
    @RequestMapping("testController.do")
    public void testTwo() {
        System.out.println("TestTwo");
    }
    @RequestMapping(value = "test.do",params = {"uname","age"},method = RequestMethod.GET,headers= "Accept=text/html")
    public void testOne() {
        System.out.println("TestOne");
    }





//    =====================================

//    @RequestMapping("testParams.do")
//    public String handleParams(@RequestParam("user") String username, Integer age, String sex) {
//
//        System.out.println("====="+username+"====="+age+"====="+sex+"=====");
//
//        return "welecome.jsp";
//    }

//    @RequestMapping("testParams.do")
//    public String handleParams(User user) {
//
//        System.out.println(user); //User{username='alvis', age=23, sex='male', wallet=[Wallet{color='black', price=123.0}, Wallet{color='red', price=321.0}]}
//
//        return "welecome.jsp";
//    }


//    @RequestMapping("testParams.do")
//    public String handleParams(@RequestParam Map<String, Object> map) {
//
//        System.out.println(map); // {username=alvis, sex=male, age=23}
//
//        return "welecome.jsp";

//    }

//    @RequestMapping("testParams.do")
//    public String handleParams(HttpServletRequest request){
//
//
//        String username = request.getParameter("username");
//        String sex = request.getParameter("sex");
//        String age = request.getParameter("age");
//
//        System.out.println("====="+username+"====="+age+"====="+sex+"=====");  // =====alvis=====23=====male=====
//
//        return "welecome.jsp";
//    }

    @RequestMapping("testParams.do")
    public String handleParams(User user) {

        System.out.println(user);

        return "welecome.jsp";
    }

}
