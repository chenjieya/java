package com.cj.controller;

import com.cj.domain.Guest;
import com.cj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("/guest/index")
    public String getList(Model model) {
        // 查数据，将数据传递给视图
        List<Guest> list = guestService.getList();
        model.addAttribute("list", list);
        return "index";
    }

    // 去添加页面
    @RequestMapping("/guest/toAdd")
    public String add() {
        return "add";
    }

    // 添加信息
    @RequestMapping("/guest/add")
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest/index";
    }

    // 删除
    @RequestMapping("/guest/delete")
    public String delete(String name) {
        guestService.delete(name);
        return "redirect:/guest/index";
    }

    // 去修改页面
    @RequestMapping("/guest/toUpdate")
    public String toUpdate(String name, Model model) {
        Guest one = guestService.getOne(name);

        model.addAttribute("info", one);

        return "update";
    }

    // 更改
    @RequestMapping("/guest/update")
    public String update(Guest guest) {

        guestService.update(guest);

        return "redirect:/guest/index";
    }

}
