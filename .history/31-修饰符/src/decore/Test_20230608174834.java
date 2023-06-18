package decore;

public class Test {
    /**
     *   public 任何地方都可以
     *
     * */
    public static void main(String[] args) {
        // 同包中测试修饰符（private不可以）
        TestDecore ts = new TestDecore();
        ts.TestDefault();
        ts.TestProtected();
        ts.TestPublic();
//        ts.TestPrivate();
    }
}
