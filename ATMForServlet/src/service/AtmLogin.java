package service;

import dao.AtmDao;
import domain.AtmClass;
import utils.MySpring;

public class AtmLogin {

    private AtmDao atmDao = MySpring.getBean("dao.AtmDao");

    public String login(String userName, String password) {

        // 需要读取数据库中的数据（dao）
        AtmClass atm = atmDao.selectOne(userName);

        if (atm != null && atm.getApassword().equals(password)) {
            return "登录成功";
        }

        return "用户名或密码错误";
    }

}
