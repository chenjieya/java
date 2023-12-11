package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 将类交给Spring，但是要让Spring的配置文件，扫描到该注解
@Controller
// 请求路径
@RequestMapping("testController.do")
public class TestController {

    // 请求执行方法
    @RequestMapping
    public void test() {
        System.out.println("Controller 控制层开始执行了");
    }
}
