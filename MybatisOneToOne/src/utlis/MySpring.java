package utlis;

import java.util.HashMap;

public class MySpring {

    private static HashMap<String, Object> map = new HashMap<>();

    public static <T>T getBean(String fullname) {

        T o = (T)map.get(fullname);

        if (o == null) {
            try {
                o = (T)Class.forName(fullname).newInstance();
                map.put(fullname,o);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return o;
    }

}
