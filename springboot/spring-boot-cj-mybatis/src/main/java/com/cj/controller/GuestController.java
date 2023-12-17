package com.cj.controller;

import com.cj.domain.Guest;
import com.cj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public String getList(Model model) {
        // 查数据，将数据传递给视图
        List<Guest> list = guestService.getList();
        model.addAttribute("list", list);
        return "index";
    }


}
