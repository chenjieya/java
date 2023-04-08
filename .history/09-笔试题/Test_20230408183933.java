public class Test {
  public static void main(String[] args) {
    // 1. &和&&的区别
    /**
     * &可以当作位运算和逻辑运算，&&只能是逻辑运算
     * 如果两个都是逻辑运算的话，有如下区别：
     * &前后两个都是true的时候，最后的结果是true
     * &&短路与正常情况下与&执行的结果是一致的
     *  当前面的条件为false的时候，发生短路，最终结果是false
     */

    //  2. 最有效率的计算2*8的结果
    /**
     * 使用位运算
     * 00001000 -> 8
     * 2<<3 -> 2乘以2的3次幂
     * 00000010 -> 00010000 -> 16
     */

    //  3. 将两个值进行互换 int a=1; int b=2;
    int a = 1;
    int b = 2;
    int c = a;
    a = b;
    b = c;
    System.out.println(a);
    System.out.println(b);

    int d = 1;
    int f = 2;
    d = d + f;
    f = d - f;
    d = d - f;
    System.out.println(d);
    System.out.println(f);
  }
}
