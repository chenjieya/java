package service;

import dao.AtmDao;
import domain.UserClass;
import utils.MySpring;

public class AtmService {

    private AtmDao dao = MySpring.getBean("dao.AtmDao");

    public String login(String username, String password) {

        // 调用数据库层
        UserClass userClass = dao.selectOne(username);

        // 方案二:将userClass对象返回，交给控制层（不好，业务需要在业务成处理）
        if(username.equals(userClass.getAname()) && password.equals(userClass.getApassword())) {
            return "登录成功";
        }

        return "用户名或密码错误";
    }


    // 想要在welcome页面展示昵称-方案一设计一个方法
    public String getNickName(String username) {
        UserClass userClass = dao.selectOne(username);
        // 这个方法非常不好，这又查询了一次
        return userClass.getNickname();
    }

}
