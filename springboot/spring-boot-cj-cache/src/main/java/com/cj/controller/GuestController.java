package com.cj.controller;

import com.cj.domain.Guest;
import com.cj.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public List<Guest> getGuestList() {
        return guestService.getList();
    }

    @GetMapping("/{id}")
    public Guest getGuest(@PathVariable String id) {
        return guestService.selectOne(id);
    }

}
