package utils;

import java.util.HashMap;

public class MySpring {

    private static HashMap<String, Object> obj = new HashMap<>();


    public static <T>T getBean(String fullname) {

        T o = (T)obj.get(fullname);

        try {
            // 没有对象
            if (o == null) {
                // 找到对应的类
                Class<?> aClass = Class.forName(fullname);
                o = (T)aClass.newInstance();  // 创建对象
                obj.put(fullname, o);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return o;
    }

}
