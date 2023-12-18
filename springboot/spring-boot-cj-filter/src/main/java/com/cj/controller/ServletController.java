package com.cj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServletController {

    @GetMapping("/servlet")
    public String testInterceptor() {
        System.out.println("-------------ServletController-------");
        return "testInterceptor";
    }

}
