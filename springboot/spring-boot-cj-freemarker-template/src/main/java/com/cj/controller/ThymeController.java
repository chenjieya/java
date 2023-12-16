package com.cj.controller;

import com.cj.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {

    @RequestMapping("/thyme")
    public String index(Model model) {
        User user = new User();
        user.setAge(18);
        user.setName("chenjie");
        model.addAttribute("name", "Thymeleaf");
        model.addAttribute("user", user);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "/thymeleaf/welcome";
    }

}
