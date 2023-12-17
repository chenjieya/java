package com.cj.controller;

import com.cj.domain.Guest;
import com.cj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

//    @RequestMapping(method = RequestMethod.GET)
    // 简写
    @GetMapping
    public String getList(Model model) {
        // 查数据，将数据传递给视图
        List<Guest> list = guestService.getList();
        model.addAttribute("list", list);
        return "index";
    }

    // 去添加页面
    @GetMapping("/toAdd")
    public String add() {
        return "add";
    }

    // 添加信息
    @PostMapping
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest";
    }

    // 删除
    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name) {
        guestService.delete(name);
        return "redirect:/guest";
    }

    // 去修改页面
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable("name") String name, Model model) {
        Guest one = guestService.getOne(name);

        model.addAttribute("info", one);

        return "update";
    }

    // 更改
    @PutMapping
    public String update(Guest guest) {

        guestService.update(guest);

        return "redirect:/guest";
    }

}
