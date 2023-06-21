import singleTon.SingleTon;

public class Main {
    public static void main(String[] args) {
        // 单列模式
        /**
         * 单列模式是只创建一次对象
         */
        SingleTon single = SingleTon.getSingle();
        SingleTon single1 = SingleTon.getSingle();
        System.out.println(single == single1);  // true
        System.out.println(single.equals(single1));// true
        System.out.println(single);
        System.out.println(single1);
//        SingleTon.single = null;
//        SingleTon single2 = SingleTon.single;
//        System.out.println(single2);
    }
}
