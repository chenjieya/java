package bank;

public class Main {
    /**
     * 银行小练习
     */

    public static void main(String[] args) {
        Person om = new OldMan("长者");
        Person ym = new YoungMan("年轻人");
        Person tf = new YoungMan("土豪");

        Bank bank = new Bank();
        bank.handle(om);

        bank.handle(ym);

        bank.handle(tf);
    }
}
