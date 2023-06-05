package school;

public class Computer {
    private boolean computerState = false;
    private int computedNumber;  // 电脑编号

    public Computer() {}
    public Computer(int num) {
        this.computedNumber = num;
    }

    public boolean turnOn() {
        this.computerState = true;
        return true;
    }

    public boolean turnOff() {
        this.computerState = false;
        return false;
    }

    public int getComputerNum() {
        return this.computedNumber;
    }

    public boolean isUsed() {
        return this.computerState;
    }
}
