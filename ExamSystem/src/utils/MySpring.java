package utils;

import java.util.HashMap;

public class MySpring {

    private static HashMap<String, Object> beanBox = new HashMap<>();

    public static <T>T getBean(String beanName) {

        T obj = null;
        try {
            obj = (T) beanBox.get(beanName);
            if (obj == null) {
                Class clazz = Class.forName(beanName);
                obj = (T)clazz.newInstance();
                beanBox.put(beanName, obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
