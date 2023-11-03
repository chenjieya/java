package Server;

import dao.UserDao;
import domain.User;
import utils.MySpring;

public class LoginServe {
    private UserDao Dao = MySpring.getBean("dao.UserDao");
    public String loginMethod(String account, String password) {
        User user = Dao.selectOne(account);
        if (user != null && user.getPassword().equals(password)) {
            return "登录成功";
        }
        return "用户名或密码错误";
    }
}
