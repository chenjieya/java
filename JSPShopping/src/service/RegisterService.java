package service;

import dao.UserDao;
import domain.UserClass;
import utils.MySpring;

public class RegisterService {

    private UserDao dao = MySpring.getBean("dao.UserDao");

    // 注册
    public String register(String username, String password) {
        System.out.println("注册");
        // 查询数据库，看是否存在
        UserClass userClass = dao.selectOne(username);

        if (userClass == null) {
            // 如果不存在，则注册
            dao.insert(new UserClass(username, password));
            return "注册成功";
        }
        return "用户已存在";
    }

}
