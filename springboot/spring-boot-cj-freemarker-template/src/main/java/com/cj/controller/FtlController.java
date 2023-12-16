package com.cj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


/**
 * @RestController 不要使用，使用她返回的是json形式的数据
 * 而这里我们返回的是 视图
 */
@Controller
public class FtlController {

    @RequestMapping("/ftl")
    public String index(Model model){
        model.addAttribute("now", new Date().toString());
        return "/freemarker/index";
    }
}
