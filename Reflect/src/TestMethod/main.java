package TestMethod;

import java.lang.reflect.Method;

public class main {

    public static void main(String[] args) {
        try {
            // 获取class类
            Class clazz = Class.forName("TestMethod.Person");
            // 通过类获取方法
            // 1. 获取没有参数的方法
            Method m = clazz.getMethod("eat");
            // 2. 获取带参数的方法，需要写参数类型的类
            Method mp = clazz.getMethod("eat", String.class);

            // 1. 获取修饰符
            m.getModifiers();

            // 2. 获取返回值类型(数据类型的Class)
            Class res = m.getReturnType();
            System.out.println(res.getName());

            // 3. 获取方法参数列表的类型
            Class[] params = mp.getParameterTypes();
            // 4. 获取方法抛出异常的类型
            Class[] excetions = mp.getExceptionTypes();

            // 5. 执行方法
            System.out.println("----------");
            Person p = (Person) clazz.newInstance();
            String str = (String)mp.invoke(p,"反射调用函数");
            System.out.println(str);  // 返回值


//            Method fSleep = clazz.getMethod("sleep");
//            System.out.println(fSleep.getName()); // sleep
//            Method fSpeek = clazz.getMethod("speek");
//            System.out.println(fSleep.getName());

            Method fSleep = clazz.getDeclaredMethod("swiming");
            System.out.println(fSleep.getName());  // swiming
            fSleep.setAccessible(true);
            fSleep.invoke(p);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
