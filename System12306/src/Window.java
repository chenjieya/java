public class Window extends Thread {
    private String windowName;

    public Window (String widnowName) {
        this.windowName = widnowName;
    }

    public void run() {
        this.sellTick();
    }

    private void sellTick() {
        while(true) {
            System12306 sys = System12306.getInstance();
            Ticket tick = sys.buyTick();

            if (tick == null) {
                System.out.println("对不起，"+windowName+"窗口没有票卖没了");
                break;
            }
            System.out.println("窗口"+windowName+"正在出售从"+tick.getStart()+"到"+tick.getEnd()+"的车票。票价"+tick.getPrice());
        }
    }
}
