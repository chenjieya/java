public class Main {
    public static void main(String[] args) {

        /**
         * 包装类
         * jdk1.5之后会自动的包装和拆包
         * 所以可以Integer i1 = 10;
         *
         * 这个在-127-128范围内是存在静态区域内部的，超过这个范围则会创建对象
         *
         * new Integer（）是创建了包装类对象
         *
         * equles在Object对象中的方法，和==功能一样，比较的是地址
         * 但是在Integer类中被重写了，会进行值的比较
         *
         * https://docs.oracle.com/javase/8/docs/api/
         */

        Integer i1 = 1000;  // 1000
        Integer i2 = 1000;  // 1000
        Integer i3 = 100;
        Integer i4 = new Integer(100);
        System.out.println(i1 == i2); // false

        System.out.println(i3==i4);
        System.out.println(i4.equals(i3));
    }
}
