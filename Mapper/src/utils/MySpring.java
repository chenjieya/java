package utils;

import java.util.HashMap;

public class MySpring {

    public static HashMap<String, Object> map = new HashMap<>();

    public static <T>T getBean(String fullname) {

        T obj = (T) map.get(fullname);

        try {
            if (obj == null) {
                Class<?> aClass = Class.forName(fullname);
                obj = (T) aClass.newInstance();

                map.put(fullname,obj);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

}
