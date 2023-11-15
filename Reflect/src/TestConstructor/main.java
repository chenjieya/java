package TestConstructor;

import java.lang.reflect.Constructor;

public class main {

    public static void main(String[] args) throws Exception {

        Class clazz = Class.forName("TestConstructor.Person");
        // 获取构造方法（无参数）
        Constructor c = clazz.getConstructor();
        // 调用构造方法
        Person p = (Person) c.newInstance();
        System.out.println(p);  // TestConstructor.Person@1b6d3586

        // 获取构造方法（带参数）
        Constructor cc = clazz.getConstructor(String.class);
        Person p1 = (Person) cc.newInstance("张三");

    }

}
