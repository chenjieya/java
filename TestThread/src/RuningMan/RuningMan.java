package RuningMan;

public class RuningMan implements Runnable {
    private String name;
    public RuningMan() {}
    public RuningMan(String name) {
        this.name = name;
    }
    // 重写run方法
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(this.name + "跑了"+i+"米");
        }
    }
}

//public class RuningMan extends Thread {
//    private String name;
//    public RuningMan() {}
//    public RuningMan(String name) {
//        this.name = name;
//    }
//    // 重写run方法
//    public void run() {
//        for(int i = 0; i < 100; i++) {
//            System.out.println(this.name + "跑了"+i+"米");
//        }
//    }
//}
