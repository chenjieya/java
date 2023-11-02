public class OneThread extends Thread {

    public void run() {
        System.out.println("One线程开始");
        TwoThread two = new TwoThread();
        try {
            two.start();
            two.join(2000);  // two对象调用，让方法two对象得线程和访问two对象得线程变成同步
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("One线程结束");
    }
}
