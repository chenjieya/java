package service;

import dao.UserDao;

public class AtmService {

    public String login(String username, String password) {

        UserDao userDao = new UserDao();

        if(userDao.selectOne(username) != null &&  userDao.selectOne(username).getPassword().equals(password)) {
            return "登录成功";
        }

        return "用户名或密码错误";
    }

}
