package testStatic;

public class Person {
    public String name;
    public static int age = 10;

    static {
        System.out.println("我是在加载类模板的时候就创建了，这个时候话没有创建对象呢");
    }
    public Person() {
        System.out.println("我是创建对象之后执行的构造函数");
    }

    public void test() {
        System.out.println("在堆内存对象中访问静态成员" + Person.age);
    }
    public static void testStatic() {
        System.out.println("在静态元素中访问静态成员" + Person.age);
    }


    public static void main(String[] args) {
        // 3. 静态成员的访问
        Person p3 = new Person();
        Person.age = 12;
        p3.test();
        Person.testStatic();
        // 2. 静态元素存储在静态区域，在加载类模板的时候就创建了
//          try {
//              Class.forName("testStatic.Person"); // 通过反射机制，不创建对象，只加载类模板
//          }catch (Exception err) {
//
//          }
        // 1.
//        Person p1 = new Person();
//        p1.name = "陈杰";
//        p1.age = 18;
//
//        Person p2 = new Person();
//        p2.name = "李舒淇";
//        p2.age = 16;
//
//
//        System.out.println(p1.name+"今年"+p1.age);
//        System.out.println(p2.name+"今年"+p2.age);
    }
}
