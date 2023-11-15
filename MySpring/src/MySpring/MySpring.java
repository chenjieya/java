package MySpring;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MySpring {
    public MySpring() {}

    /**
     * 给我一个类全名 我去创建对象
     * @param classFullName 类全名
     */
    public Object getBean(String classFullName) {
        Object obj = null;
        Scanner inp = new Scanner(System.in);
        System.out.println("请输入"+classFullName+"的属性值");
        try {
            // 通过类全名获取到类
            Class clazz = Class.forName(classFullName);

            // 通过类创建对象
            obj = clazz.newInstance();

            // 想办法让对象的属性自动注入

            // 获取到类中的属性、循环属性、调用set方法

            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {

                // 想办法找到set方法
                // set + 属性首字母大写 + 剩下的内容

                StringBuilder builder = new StringBuilder("set");
                builder.append(field.getName().substring(0, 1).toUpperCase());
                builder.append(field.getName().substring(1));

                // 类型，和属性的类型一样
                Class typeClass = field.getType();
                Method meth = clazz.getMethod(builder.toString(), typeClass);

                System.out.println("请输入"+field.getName()+"的值");
                String canshu = inp.nextLine();

                // 方法的参数不全是String类型的，所以要做处理（参数的类型就是属性的类型）
                Constructor con = typeClass.getConstructor(String.class);  // new 类型(canshu) 包装类类型转换
                meth.invoke(obj, con.newInstance(canshu));
            }


            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
