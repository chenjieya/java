package com.cj.service;

import com.cj.dao.GuestDao;
import com.cj.domain.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestDao guestDao;

    public List<Guest> getList() {
        // dao层去查询数据
        return guestDao.getList();
    }

    public void add(Guest guest) {
        guestDao.add(guest);
    }

    public void delete(String name) {
        guestDao.delete(name);
    }

    public Guest getOne(String name) {
        return guestDao.getOne(name);
    }

    public void update(Guest guest){
        guestDao.update(guest);
    }

}
