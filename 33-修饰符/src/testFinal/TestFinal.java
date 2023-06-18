package testFinal;

public class TestFinal {
    public static void main(String[] args){
        final int a;
        a = 10;
//        a = 100;  // 报错 final最终的

        final int [] b;
        b = new int[]{1,2,3};
        b[0] = 10;
        b[1] = 200;
        System.out.println(b[0]);

        TestFinal tf = new TestFinal();
        tf.testNum(1);

    }

    public final int a = 0;

    public void testNum(final int a) {
       // a = 10;  // 报错，因为可能会在外面赋值
//        this.a = 90;  // 报错
        System.out.println(this.a);
    }


}
