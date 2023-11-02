public class ThreeeThread extends Thread {

    private TwoThread two;

    public ThreeeThread(TwoThread two) {
        this.two = two;
    }
    public void run() {
        System.out.println("threeThread线程开始");

        // 用three线程,将two对象锁住
        synchronized (two) {
            try {
                System.out.println("two对象被锁");
                Thread.sleep(10000);
                System.out.println("two对象解锁了");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("threeThread线程结束");
    }
}
