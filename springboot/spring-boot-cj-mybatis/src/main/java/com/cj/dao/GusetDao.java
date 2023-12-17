package com.cj.dao;

import com.cj.domain.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GusetDao {

    @Select("select id, name, role from restaurant")
    public List<Guest> getList();

}
