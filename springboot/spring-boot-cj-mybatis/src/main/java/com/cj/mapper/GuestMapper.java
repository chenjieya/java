package com.cj.mapper;

import com.cj.domain.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper {

    @Select("select id,name,role from restaurant")
    List<Guest> getList();

}
