package utils;

import java.util.HashMap;
import java.util.Objects;

public class MySpring {

    private static HashMap<String, Object> objMap = new HashMap<>();

    public static <T>T getBean(String fullName) {

        T obj = (T)objMap.get(fullName);

        if (obj == null) {
            try {
                Class<?> aClass = Class.forName(fullName);

                obj = (T)aClass.newInstance();

                objMap.put(fullName,obj);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return obj;
    }

}
