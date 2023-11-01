import RuningMan.RuningMan;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 创建线程
        RuningMan run1 = new RuningMan("苏炳添");
        RuningMan run2 = new RuningMan("博尔特");
        RuningMan run3 = new RuningMan("加特林");

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        Thread t3 = new Thread(run3);

        t1.start();
        t2.start();
        t3.start();

        // 切换线程状态-就绪状态
        // run1.start();  //通过接口实现得类中，并没有start防范
        // run2.start();
        // run3.start();
    }
}