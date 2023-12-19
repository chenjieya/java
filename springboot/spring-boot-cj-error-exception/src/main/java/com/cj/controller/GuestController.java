package com.cj.controller;

import com.cj.bean.Guest;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {

    @PostMapping("/guest")
    public String add(@Valid Guest guest, BindingResult result) {
        StringBuffer sringbuffer = new StringBuffer();
        if(result.getErrorCount() > 0) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                sringbuffer.append(fieldError.getField());
                sringbuffer.append(":");
                sringbuffer.append(fieldError.getDefaultMessage());
                sringbuffer.append("\n");
            }
        }
        return sringbuffer.toString();
    }

    @GetMapping("/testerror")
    public String testerror() {
        new Error("错误");
        return "测试error";
    }


}
