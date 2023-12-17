package com.cj.service;

import com.cj.dao.GuestDao;
import com.cj.domain.Guest;
import com.cj.respository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> getList() {
        // dao层去查询数据
        return guestRepository.findAll();
    }

}
