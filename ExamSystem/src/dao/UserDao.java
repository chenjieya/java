package dao;

import domain.User;
import utils.UserFileReader;

/**
 * 数据得持久层
 * 只负责数据得读写，不负责处理逻辑
 */
public class UserDao {

    public User selectOne(String accout) {
        return UserFileReader.userBoxMap.get(accout);
    }
}
