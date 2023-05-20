package relation;

public class Beutcher {
    // 屠夫

    public void kill(Pig pig) {
        System.out.println("猪的名字："+pig.getName()+"猪的体重是："+pig.getWeight());
        pig.beKilled();
    }
}
