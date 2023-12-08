package domain;

public class RoomTemplate {

    private Computer computer1;
    private Computer computer2;
    private Computer computer3;

    @Override
    public String toString() {
        return "RoomTemplate{" +
                "computer1=" + computer1 +
                ", computer2=" + computer2 +
                ", computer3=" + computer3 +
                '}';
    }

    public Computer getComputer1() {
        return computer1;
    }

    public void setComputer1(Computer computer1) {
        this.computer1 = computer1;
    }

    public Computer getComputer2() {
        return computer2;
    }

    public void setComputer2(Computer computer2) {
        this.computer2 = computer2;
    }

    public Computer getComputer3() {
        return computer3;
    }

    public void setComputer3(Computer computer3) {
        this.computer3 = computer3;
    }

    public RoomTemplate() {
    }

    public RoomTemplate(Computer computer1, Computer computer2, Computer computer3) {
        this.computer1 = computer1;
        this.computer2 = computer2;
        this.computer3 = computer3;
    }
}
