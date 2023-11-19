package service;

import dao.AtmDao;
import utils.MySpring;

public class AtmSearchServer {

    private AtmDao atmDao = MySpring.getBean("dao.AtmDao");
    public Float search(String name) {
        // 调用Dao数据层，查询当前用户的钱
        Float money = atmDao.getBalance(name);

        return money;
    }

}
