package com.cj.service;

import com.cj.dao.GusetDao;
import com.cj.domain.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GusetDao guestDao;
    public List<Guest> getList() {
        // dao层去查询数据
        return guestDao.getList();
    }

}
