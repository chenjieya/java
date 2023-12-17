package com.cj.service;

import com.cj.domain.Guest;
import com.cj.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestMapper guestDao;


    public List<Guest> getList() {
        // dao层去查询数据
        return guestDao.selectList(null);
    }


}
