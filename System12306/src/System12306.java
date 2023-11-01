import java.util.Vector;

public class System12306 {

    // Vector线程安全
    Vector<Ticket> tickets = new Vector<>();
    // 创建车票
    {
        for (int i = 10; i < 100; i++) {
            tickets.add(new Ticket("天津"+i, "哈尔滨"+i, (i%5+5)*25F));
        }
    }

    // 单列模式-系统类只需要创建一个
    private static System12306 system = new System12306();

    private System12306() {}

    public static System12306 getInstance() {
        return system;
    }

    // 发放车票
    public Ticket buyTick() {
        try {
            return tickets.remove(0);
        } catch (Exception e) {
            return null;
        }
    }

}
