import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        System.out.println("欢迎使用ATM系统！！！\n请输入用户名：");
        Scanner inp = new Scanner(System.in);
        String aname = inp.nextLine();
        System.out.println("请输入密码：");
        String pwd = inp.nextLine();


        String result = atm.loginATM(aname, pwd);

        if (result.equals("登录成功")) {
            System.out.println("恭喜你，登录成功！！\n输入1查询余额\n输入2取款\n输入3存款\n输入4退出");
            String xuhao = inp.nextLine();

            switch(xuhao) {
                case "1":
                    System.out.println("您的余额为：" + atm.searchPrice(aname));
                    break;
                case "2":
                    System.out.println("请输入取款金额：");
                    Float money = inp.nextFloat();
                    atm.getMoney(aname, money);
                case "3":
                    System.out.println("请输入存款金额：");
                    atm.setPrice(aname, inp.nextFloat());
            }
        } else{
            System.out.println("对不起, 用户名或密码错误");
        }

    }
} 