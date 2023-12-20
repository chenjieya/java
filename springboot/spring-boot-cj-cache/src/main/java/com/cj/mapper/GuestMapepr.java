package com.cj.mapper;

import com.cj.domain.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GuestMapepr {

    @Select("select id, name, role from guest")
    public List<Guest> getList();

    @Select("select id, name, role from guest where id = #{id}")
    public Guest selectOne(String id);

}
