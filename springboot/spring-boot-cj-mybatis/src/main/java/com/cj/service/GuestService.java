package com.cj.service;

import com.cj.dao.GusetDao;
import com.cj.domain.Guest;
import com.cj.mapper.GuestMapper;
import com.cj.mapper2.GuestMapper2;
import com.cj.tk.mybatis.TKGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

//    @Autowired
//    private GusetDao guestDao;

//    @Autowired
//    private TKGuestMapper tkGuestMapper;


//    public List<Guest> getList() {
//        // dao层去查询数据
//        return guestDao.getList();
//    }

//    public List<Guest> getList() {
//        // dao层去查询数据
//        return tkGuestMapper.selectAll();
//    }
    @Autowired
    private GuestMapper mapper;

    @Autowired
    private GuestMapper2 mapper2;

    public List<Guest> getList() {
        return mapper2.getList();
    }

    public void save(Guest guest) {
        mapper2.add(guest);
    }



}
