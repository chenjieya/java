package Server;

public class LoginServe {
    public String loginMethod(String account, String password) {
        if (account.equals("admin") && password.equals("123456")) {
            return "登录成功";
        }
        return "用户名或密码错误";
    }
}
