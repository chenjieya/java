package com.cj.dao;

import com.cj.domain.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    private static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("黄晓明", "店长"));
        guestList.add(new Guest("秦海璐", "财务"));
        guestList.add(new Guest("林大厨", "厨子"));
        guestList.add(new Guest("王俊凯", "经理"));
        guestList.add(new Guest("杨紫", "前台"));
    }

    public List<Guest> getList() {
        return guestList;
    }

    public void add(Guest guest) {

        for (Guest g : guestList) {
            if (g.getName().equals(guest.getName())) {
                // 人物已经存在
                return;
            }
        }

        guestList.add(guest);
    }

    public void delete(String name) {
        for (Guest g : guestList) {
            if (g.getName().equals(name)) {
                guestList.remove(g);
                return;
            }
        }
    }

    public Guest getOne(String name) {
        for(Guest g : guestList) {
            if (g.getName().equals(name)) {
                return g;
            }
        }
        return new Guest("", "");
    }

    public void update(Guest guest){

        for (Guest g : guestList) {
            if (g.getName().equals(guest.getName())) {
                g.setRole(guest.getRole());
            }
        }

    }

}
