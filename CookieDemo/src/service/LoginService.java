package service;

public class LoginService {

    public String login(String username, String password) {

        // 按照道理应该去dao层查数据库的，这里就不写了，懒行了吧

        if (username.equals("alvis") && password.equals("666666")) {
            return "登陆成功";
        }

        return "用户名或密码错误";
    }

}
