package com.cj.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class TestPageError {

    @ExceptionHandler(Exception.class)
    public ModelAndView test(Exception e) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", e.getMessage());
        modelAndView.setViewName("/error");

        return modelAndView;
    }

}
