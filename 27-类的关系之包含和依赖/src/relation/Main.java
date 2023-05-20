package relation;

public class Main {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Pig pig = farmer.feedPid();
        Beutcher beutcher = new Beutcher();
        beutcher.kill(pig);
    }
}
