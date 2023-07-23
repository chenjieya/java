package gc;

public class Gc {


    public Gc() {
        System.out.println("GC对象被创建了");
    }

    // GC回收用的-重写了
    public void finalize() {
        System.out.println("GC对象被回收了");
    }

}
