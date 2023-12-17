package com.cj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cj.domain.Guest;

import java.util.List;

public interface GuestServiceImp  {

    List<Guest> getList();

}
