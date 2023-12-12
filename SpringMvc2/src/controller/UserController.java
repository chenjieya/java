package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import java.util.Map;

@Controller
// 添加注解，会先从attribute中找username，然后在session中也存储一份
@SessionAttributes("username")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("login.do")
    public ModelAndView login(String username,String password) {
        ModelAndView mv = new ModelAndView();

        String login = service.login(username, password);

        if (login.equals("登录成功")) {
            mv.addObject("username", username);
            mv.setViewName("welecome.jsp");
        } else{
            mv.addObject("result", login);
            mv.setViewName("index.jsp");
        }

        return mv;
    }

}
