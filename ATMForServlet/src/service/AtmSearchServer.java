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

    public void updateMoney(String name, Float money) {
        // 调用Dao读取数据/更新数据
        atmDao.updateBalance(name, money);
    }

}
