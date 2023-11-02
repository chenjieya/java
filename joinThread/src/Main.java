// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OneThread one = new OneThread();
        one.start();
    }

    /**
     * One线程开始 (导致二线程进入准备状态，并加入到一线程中， 一线程只等待2秒)
     *
     * two线程开始（导致三线程进入准备状态， 二线程延时五秒中）
     *
     * threeThread线程开始，two对象被锁（导致two对象被三线程锁定，并延时十秒钟）
     *
     * 一线程等待两秒钟时间到（因为two对象被三线程锁定了，导致一线程无法将二线程推出，所以只能进入等待）
     *
     * two线程结束（二线程的五秒钟延时时间到）
     *
     * two对象解锁了(三线程延时时间到)
     *
     * threeThread线程结束
     *
     * One线程结束
     */
}