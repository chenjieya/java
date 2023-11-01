import java.util.ArrayList;

/**
 * 仓库存放数据
 */
public class Warehouse {
    private ArrayList<String> house = new ArrayList<>();

    public synchronized void add() {
        if (house.size() < 20) {
            house.add("a");
        } else{
            // return;
            try {
                this.notifyAll();  // 唤醒其他线程
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void get() {
        if (house.size() > 0) {
            house.remove(0);
        } else{
            // return;
            try {
                this.notifyAll(); // 唤醒其他线程
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
