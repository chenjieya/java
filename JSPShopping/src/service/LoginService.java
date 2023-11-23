package service;

import dao.UserDao;
import domain.UserClass;
import utils.MySpring;

public class LoginService {

    private UserDao dao = MySpring.getBean("dao.UserDao");
    public String login(String userName, String password) {
        System.out.println("登陆");
        UserClass userClass = dao.selectOne(userName);

        if (userClass!=null && userClass.getPassword().equals(password)) {
            return "登陆成功";
        }

        return "用户名或密码错误";
    }

}
