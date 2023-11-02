package Lock;

/**
 * 死锁
 * 哲学家吃饭
 */
public class TetsLock {

    public static void main(String[] agrs){
        Kuaizi k1 = new Kuaizi("1");
        Kuaizi k2 = new Kuaizi("2");
        Kuaizi k3 = new Kuaizi("3");
        Kuaizi k4 = new Kuaizi("4");


        // 这样有点浪费时间，我们是对面做的，也就是对立的两个人可以同时进行
//        Person p1 = new Person("a", k2, k1, 0);
//        Person p2 = new Person("b", k3, k2, 3000);
//        Person p3 = new Person("c", k4, k3, 6000);
//        Person p4 = new Person("d", k1, k4, 9000);

        Person p1 = new Person("a", k2, k1, 0);
        Person p2 = new Person("b", k3, k2, 3000);
        Person p3 = new Person("c", k4, k3, 0);
        Person p4 = new Person("d", k1, k4, 3000);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }

}
