package singleTon;

public class SingleTon {
    /**
     * static 静态区域只加载一次，并且是在创建对象之前加载，只需要用类区调用，不需要对象去调用
     */
    private static SingleTon single = new SingleTon();

    /**
     * 但是如果在属性上解决单列模式的话，属性的修饰符是public，我们可以在外部将public修改掉，不安全 single = null;
     * 将方法变成public，但是存在一个问题，我们的方法此时没有办法调用，因为目前还没有对象，所以将方法变成static
     */
    public static SingleTon getSingle() {
        return single;
    }

}
