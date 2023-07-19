import myEnum.Day;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 枚举类 enum
         *  枚举类 继承 Enum 继承 Object
         *
         *  Enum：
         *  有两个属性： name-->枚举对象的名字   ordinal-->枚举对象在类中罗列的顺序
         *  valueOf 通过给定的name获取到对应的枚举对象
         *  values 获取全部的枚举对象 返回一个数组
         *  compareTo 可以比较两个枚举对象
         *  toString 没有final修饰，可以重写
         */

        Day monday = Day.Monday;

        // valueOf
        Day day = Day.valueOf("Monday");
        System.out.println(day.name() + "-----" + day.ordinal());

        // values
        Day[] days = Day.values();
        for (Day d : days) {
            System.out.println(d.name()+"---"+d.ordinal());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        String input = sc.nextLine();

        Day week = Day.valueOf(input);

        // 为什么枚举里面的对象不能使用Day.Monday????
        switch(week) {
            case Monday:
                System.out.println("今天周一");
                break;
            case Tuesday:
                System.out.println("今天周二");
                break;
            case Wednesday:
                System.out.println("今天周三");
                break;
            case Thursday:
                System.out.println("今天周四");
                break;
            case Friday:
                System.out.println("今天周五");
                break;
            case Saturday:
                System.out.println("今天周六");
                break;
            case Sunday:
                System.out.println("今天周日");
                break;
        }
    }
}
