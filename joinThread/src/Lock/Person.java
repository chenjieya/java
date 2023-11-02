package Lock;

public class Person extends Thread {
    private Kuaizi left;
    private Kuaizi right;
    private String pname;
    private long time;

    public Person(String name, Kuaizi left, Kuaizi right, long time) {
        this.pname = name;
        this.left = left;
        this.right = right;
        this.time = time;
    }

    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (left) {
            System.out.println(this.pname+"拿起了做左边的筷子"+left.getKname());
            synchronized (right) {
                System.out.println(this.pname+"拿起了做右边的筷子"+right.getKname());
                System.out.println(this.pname+"吃完了");
            }
        }
    }
}
