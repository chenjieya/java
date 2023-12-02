package utils;

import java.util.HashMap;

public class MySpring {

    private static HashMap<String,Object> obj = new HashMap<>();

    public static <T>T getBean(String fullname) {
       T o = (T)obj.get(fullname);

       if (o==null) {
           try {
               Class<?> aClass = Class.forName(fullname);
               o = (T) aClass.newInstance();
               obj.put(fullname,o);

           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
       return o;
    }

}
