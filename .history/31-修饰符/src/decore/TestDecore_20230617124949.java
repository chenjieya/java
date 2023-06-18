package decore;

public class TestDecore {

    public static void main(String[] args) {
        // 本类中测试修饰符
        TestDecore ts = new TestDecore();
        ts.TestDefault();
        ts.TestProtected();
        ts.TestPublic();
        ts.TestPrivate();
    }

    public void TestPublic() {
        System.out.println("TestDecore类中的public");
    }

     void TestDefault() {
        System.out.println("TestDecore类中的default");
    }

    protected void TestProtected() {
        System.out.println("TestDecore类中的protected");
    }

    private void TestPrivate() {
        System.out.println("TestDecore类中的private");
    }
}
