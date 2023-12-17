package com.cj.mapper2;

import com.cj.domain.Guest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper2 {

    @Select("select id,name,role from restaurant")
    List<Guest> getList();

    @Insert("insert into restaurant(name,role) values(#{name},#{role})")
    void add(Guest guest);

}
