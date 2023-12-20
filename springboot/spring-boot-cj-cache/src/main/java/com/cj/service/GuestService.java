package com.cj.service;

import com.cj.domain.Guest;
import com.cj.mapper.GuestMapepr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestMapepr guestMapepr;

    public List<Guest> getList() {
        return guestMapepr.getList();
    }

    public Guest selectOne(String id) {
        return guestMapepr.selectOne(id);
    }

}
