import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {

            Class<?> clazz = Class.forName("Person");
            Method eat = clazz.getMethod("eat");

            MyAnnotation annotation = eat.getAnnotation(MyAnnotation.class);

            Class<? extends MyAnnotation> aClass = annotation.getClass();
            Method value = aClass.getMethod("value");
            String[] invoke = (String[])value.invoke(annotation);

            for (String item : invoke) {
                System.out.println(item);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}