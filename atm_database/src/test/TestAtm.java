package test;

import Dao.AtmDao;
import doman.Atm;
public class TestAtm {

    private AtmDao atmd = new AtmDao();

    // 登录

    public String login(String userName, String password) {
        String result = "用户名或密码错误";
        Atm atm = atmd.selectOne(userName);
        if (atm != null && atm.getPassword().equals(password)) {
            result = "登录成功";
        }
        return result;
    }

    // 查询余额
    public Float queryMony(String aname) {
        Atm atm = atmd.selectOne(aname);
        return atm.getBalance();
    }


    // 存款
    public void cunkuan(String name,  Float money) {
        // 查询出来name的信息
        Atm atm = atmd.selectOne(name);
        atm.setBalance(atm.getBalance() + money);
        // JDBC 写sql将信息存入进去  取款也是写数据
        atmd.update(atm);
    }

    // 取款
    public void qukuan(String name, Float money) {
        Atm atm = atmd.selectOne(name);
        if (atm.getBalance() >= money) {
            atm.setBalance(atm.getBalance() - money);
            atmd.update(atm);
        } else{
            System.out.println("您的余额不足");
        }
    }

    // 转账
    public void zhuanzhang(String name, String toName, Float money) {
        // 查询转出账户的信息
        Atm outUser = atmd.selectOne(name);
        // 查询转入账户信息
        Atm inUser = atmd.selectOne(toName);

        if (outUser.getBalance() > money) {
            outUser.setBalance(outUser.getBalance()-money);
            inUser.setBalance(inUser.getBalance()+money);

            // 更新数据库
            atmd.update(outUser);
            atmd.update(inUser);
        } else{
            // 余额不足
            System.out.println("您的余额不足");
        }
    }

    // 开户
    public void kaihuhu(String name, String pwd, Float money) {
        Atm atms = atmd.selectOne(name);
        if (atms != null) {
            System.out.println("用户已存在");
        } else{
            atmd.insert(new Atm(name, pwd, money));
            System.out.println("开户成功");
        }
    }

    // 销户
    public void xiaohu(String name, String password) {
        String loginRes = this.login(name, password);
        if (loginRes.equals("登录成功")) {
            // 销户
            atmd.delete(name);
            System.out.println("销户成功");
        } else{
            System.out.println(loginRes);
        }
    }

}
