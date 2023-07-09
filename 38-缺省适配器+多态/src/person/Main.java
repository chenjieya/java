package person;

public class Main {
    /**
     * 多态
     * 同一个对象体现出来多种不同形态，将一种行为表现出不同的效果
     *
     * 父类Person  子类Teacher
     *
     * Person p = new Teacher();  // 类型转换，向上转型
     * 只能用父类中存在的内容，子类中只能用重写的方法
     *
     * 要想使用子类中的独特的方法，就要强制类型转换，向下转型，存的是地址，和之前的地址相同
     * Teacher t = (Teacher)p;
     */

    public static void main(String[] args) {
        // 1. 正常使用
//        Teacher t = new Teacher();
//        System.out.println(t.name);
//        t.eat();
//        t.teach();
//        t.sleep();

        // 2. 多态
        Person p = new Teacher();
        System.out.println(p.name);
        p.eat();  // 子类重写的方法
        p.sleep();  // 父类中的方法

        // 使用子类中的方法，向下类型转换
        Teacher t = (Teacher) p;
        t.teach();
        t.sleep();
        t.eat();
        System.out.println(t.name);


    }
}


