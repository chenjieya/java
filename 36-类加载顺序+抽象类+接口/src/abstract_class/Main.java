package abstract_class;

public class Main {
    public static void main(String[] args) {
        /**
         * 抽象类
         *
         * abstract可以修饰方法 和 类
         * 抽象方法必须放到抽象类中，抽象类中可以不包含抽象方法
         *
         * 抽象类和普通的类相比有什么区别?
         * 抽象类中可以包含普通类中的任何属性，方法，块，构造函数，修饰符等
         * 但是抽象类虽然包含构造方法，但并不能创建对象（构造函数是给子类用的，只能通过子类的继承来使用）
         *
         * 普通类要是继承抽象类的话，普通类必须要使用抽象类中的抽象方法，因为普通类中不包含抽象方法，要是存在继承关系，不使用父类中的抽象方法的话，会报错
         */

        Person p = new Person();
        p.eat();
        p.sleep();

        Pig pig = new Pig();
        pig.eat();
        pig.sleep();
    }
}
