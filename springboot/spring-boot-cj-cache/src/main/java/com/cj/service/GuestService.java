package com.cj.service;

import com.cj.domain.Guest;
import com.cj.mapper.GuestMapepr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestMapepr guestMapepr;

    public List<Guest> getList() {
        return guestMapepr.getList();
    }

    @Cacheable("guests")
    public Guest selectOne(String id) {
        System.out.println("查询第"+id+"位嘉宾");
        return guestMapepr.selectOne(id);
    }

    // 更新缓存
    @CachePut(cacheNames = "guest", key= "#id")
    public Guest updateGuest(Guest guest){
        System.out.println("更新第"+guest.getId()+"位嘉宾");
        guestMapepr.updateGuest(guest);
        return guest;
    }

}
