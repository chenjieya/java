public class TwoThread extends Thread {

    public void run() {
        System.out.println("two线程开始");
        ThreeeThread three = new ThreeeThread(this);
        three.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("two线程结束");
    }
}
