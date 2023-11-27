package utils;

import java.util.HashMap;

public class ThreadHandler {

    private static HashMap<String, ThreadLocal> obj = new HashMap<>();

    public static ThreadLocal getThreadLocal(String name) {

        ThreadLocal o = obj.get(name);

        if (o == null) {
            o = new ThreadLocal<>();

            obj.put(name, o);
        }
        return o;
    }

}
