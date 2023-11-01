/**
 * 生产者
 */
public class Producer extends Thread {

    private Warehouse house;
    public  Producer(Warehouse house) {
        this.house = house;
    }

    public void run() {
        while(true) {
            house.add();
            System.out.println("生产者往里面添加了一个元素");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
