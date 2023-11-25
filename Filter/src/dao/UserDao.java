package dao;

import damain.UserClass;

public class UserDao {

    public UserClass selectOne(String username) {

        UserClass user = null;

        if (username.equals("alvis")) {
            user = new UserClass("alvis", "666");
        }

        return user;
    }

}
