package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @RequestMapping("interceptor.do")
    public void test() {
        System.out.println("test controller执行了");
    }


}
