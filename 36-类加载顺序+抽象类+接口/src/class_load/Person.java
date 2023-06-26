package class_load;

public class Person extends Animation {
    public String test = "PersonField";
    public static String testStatic = "PersonStaticField";


    public Person() {
        System.out.println("我是Person中的构造方法10");
    }

    public void testPerson() {
        System.out.println("我是Person类中的普通方法8");
    }

    public static void testStatic() {
        System.out.println("我是Person类中的静态方法3");
    }

    {
        this.testPerson();
        System.out.println("我是Person类中的普通块" + this.test + "9");
    }

    static {
        Person.testStatic();
        System.out.println("我是Person中的静态块" + testStatic + "4");
    }
}
