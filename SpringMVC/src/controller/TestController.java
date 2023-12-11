package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
