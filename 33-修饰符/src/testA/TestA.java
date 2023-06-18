package testA;

public class TestA {
    public static void main(String[] args) {
        // TestA 类中的主方法
        TestA ta = new TestA();
        ta.testDefault();
        ta.testPrivate();
        ta.testProtected();
        ta.testPublic();
    }

    public void testPublic() {
        System.out.println("测试testA类中的public修饰符");
    }

    protected void testProtected() {
        System.out.println("测试testA类中的protected修饰符");
    }

     void testDefault() {
        System.out.println("测试testA类中的default修饰符");
    }

    private void testPrivate() {
        System.out.println("测试testA类中的private修饰符");
    }
}
