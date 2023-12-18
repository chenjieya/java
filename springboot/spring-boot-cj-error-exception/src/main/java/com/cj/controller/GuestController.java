package com.cj.controller;

import com.cj.bean.Guest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestController {

    @PostMapping("/guest")
    public String add(@Valid Guest guest) {
        return "add guest success";
    }


}
