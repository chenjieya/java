import TestReflect.Person;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            Class clazz = Class.forName("TestReflect.Person");
//            Field nameField = clazz.getField("name");
//            Class fclazz = nameField.getType();
//            System.out.println(fclazz.getName());  // java.lang.String
//
//            String name = nameField.getName();
//            System.out.println(name);
//
//            Person p = (Person) clazz.newInstance();
//            nameField.set(p, "张三");
//            System.out.println(p);  // Person{name='张三', age=0}
//            String str = (String) nameField.get(p);
//            System.out.println(str); // 张三

            Person p = (Person) clazz.newInstance();
            Field f = clazz.getDeclaredField("age");  // age是Person类得私有属性
            f.setAccessible(true);  // 设置私有属性也可以进行操作
            f.set(p, 18);
            int str = (int) f.get(p);
            System.out.println(str);


//            int modifiers = clazz.getModifiers();
//            System.out.println(modifiers);
//
//            // 2. getName()/getSimpleName()  获取类名
//            String fullName = clazz.getName(); // 获取类全名（包含包名）
//            String simpleName = clazz.getSimpleName(); // 获取单纯得类名
//            System.out.println(fullName);
//            System.out.println(simpleName);
//            // 3. 获取类所在得包
//            Package p = clazz.getPackage();
//            String pname = p.getName();  // 包对象里面有一个获取包名得方法
//            System.out.println(pname);
//
//            // 4. getSuperClass()  获取超类(父类)
//            Class sClass =  clazz.getSuperclass();
//            System.out.println(sClass.getName());  // 获取到类全名

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


//        ArrayList<String> list = new ArrayList<>();
//        Class cl = list.getClass();  // 获取到ArrayList类
//        Class scl = cl.getSuperclass();  // 获取到ArrayList父类


//        while(scl!=null) {
//            System.out.println(scl.getName());  //java.util.AbstractList
//            scl = scl.getSuperclass();
//        }

//        Class[] inter = cl.getInterfaces();
//        for (Class interClazz : inter) {
//            System.out.println(interClazz.getName());
//        }



    }
}