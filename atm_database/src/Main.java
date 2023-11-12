import test.TestAtm;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TestAtm ta = new TestAtm();
        Scanner inp = new Scanner(System.in);

        System.out.println("请输入用户名");
        String user = inp.nextLine();
        System.out.println("请输入密码");
        String pwd = inp.nextLine();

        String loginRes = ta.login(user, pwd);

        if (loginRes.equals("登录成功")) {
            System.out.println("尊敬的"+user+"用户，欢迎您登录我行的ATM系统");


            while(true) {
                System.out.println("请输入要执行的操作：\n1.查询余额\n2.取款\n3.存款\n4.转账\n5.开户\n6.销户\n0.退出");

                String a = inp.nextLine();

                if(a.equals("0")) {
                    break;
                }

                switch (a) {
                    case "1":
                        System.out.println("您当前的余额为："+ta.queryMony(user));
                    break;
                    case "2":
                        System.out.println("请输入取款金额：");
                        String money = inp.nextLine();
                        ta.qukuan(user,Float.parseFloat(money));
                    break;
                    case "3":
                        System.out.println("请输入存款金额：");
                        String qunmoney = inp.nextLine();
                        ta.cunkuan(user,Float.parseFloat(qunmoney));
                    break;
                    case "4":
                        System.out.println("请输入转账用户名：");
                        String toName = inp.nextLine();
                        System.out.println("请输入转账金额：");
                        String zhuanMoney = inp.nextLine();
                        ta.zhuanzhang(user, toName,  Float.parseFloat(zhuanMoney));
                    break;
                    case "5":
                        System.out.println("请输入用户名：");
                        String users = inp.nextLine();
                        System.out.println("请输入密码：");
                        String pwds = inp.nextLine();
                        System.out.println("请输入存款金额：");
                        String moneys = inp.nextLine();
                        ta.kaihuhu(users,pwds,Float.parseFloat(moneys));
                    break;
                    case "6":
                        System.out.println("请输入用户名：");
                        String xaiohuName = inp.nextLine();
                        System.out.println("请输入密码：");
                        String xiaohuMima = inp.nextLine();
                        ta.xiaohu(xaiohuName, xiaohuMima);
                    break;
                }


            }


        } else {
            System.out.println(loginRes);
        }
    }
}