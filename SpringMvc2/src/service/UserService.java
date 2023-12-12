package service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String login(String username,String password){

        if (username.equals("admin") && password.equals("admin")) {
            return "登录成功";
        }

        return "用户名或密码错误";
    }
}
