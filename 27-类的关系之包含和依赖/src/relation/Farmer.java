package relation;

public class Farmer {
    // 农夫

    /**
     * 农夫养猪
     * @return 将猪返回
     */
    public Pig feedPid() {
        Pig pig = new Pig("佩奇");
        pig.growUp(5);
        return pig;
    }
}
