package class_load;

public class Animation {
    public String test = "AnimationField";
    public static String testStatic = "AnimaitionStaticField";


    public Animation() {
        System.out.println("我是Animation中的构造方法7");
    }

    public void test() {
        System.out.println("我是Animation类中的普通方法5");
    }

    public static void testStatic() {
        System.out.println("我是Animation类中的静态方法1");
    }

    {
        this.test();
        System.out.println("我是Animation类中的普通块" + this.test + "6");
    }

    static {
        Animation.testStatic();
        System.out.println("我是Animation中的静态块" + testStatic+ "2");
    }

}
