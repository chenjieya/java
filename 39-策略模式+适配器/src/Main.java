public class Main {
    public static void main() {
        /**
         * 策略模式-银行练习
         *
         * 内部类
         * 1. 成员内部类
         *  将一个类直接定义在类的里面 作为成员 与属性和方法层次一致
         *  成员内部类可以与正常的内部类一样，可以使用不同的权限修饰符/特征修饰符来修饰
         *
         *  为什么要写内部类呢？
         *  好处:
         *      1. 省略了一个文件
         *      2. 成员内部类中可以访问外部类的所有的成员的，包括私有的属性
         *  若想在内部类中访问外部类中的属性和方法，需要使用 外部类.this.方法/属性
         *
         * 2。局部内部类
         *  将一个类定义在方法或者块里面 作为成员的内部结构 与临时的局部变量一个层次
         *
         *  局部内部类像一个临时变量一样，不能通过pulic等修饰
         *  可以使用abstract final修饰
         * 3. 匿名内部类
         *  成员匿名内部类
         *  局部匿名内部类
         *
         *  匿名内部类是没有名字，举个列子
         *  // 平时写法
         *  public interfase Test { public void test(); }
         *  public class Son implements Test {
         *      public void test() {}
         *  }
         *  Test t = new Son();
         *  // 内部类写法
         *  public interfase Test { public void test(); }
         *  Test t = new Test() {   // new的不是接口，是接口后面的匿名类
         *      public void test() {}
         *  }
         * 4. 静态内部类
         *  成员静态内部类
         *
         */
    }
}
