package TestString;

import java.lang.reflect.Field;

public class ReflactString {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        TestString();
    }

    /**
     * 通过反射技术更改字符串得不可变
     */
    public static void TestString() throws NoSuchFieldException, IllegalAccessException {
        String str = new String("abc");
        // 第一次输出
        System.out.println(str);

        Class clazz = str.getClass();

        // private final char value[]{'a','b',''c};
        Field f = clazz.getDeclaredField("value");
        f.setAccessible(true);  // 设置可以对私有属性进行操作

        char[] temp = (char[])f.get(str);  // 获取到value数组得地址

        temp[0] = '李';temp[1]='舒';temp[2]='淇';
        System.out.println(str);  // 将abc更改为李舒淇

    }
}
