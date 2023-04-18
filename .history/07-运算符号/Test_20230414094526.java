public class Test {
  public static void main(String[] args) {
    int a = 5;
    System.out.println(a / 2); // java中的除，如果你没有重新声明变量空间，则按照最原始的变量空间重新赋值（int-最后的结果也是int类型）


    float b = a / 2;
    System.out.println(b); // 2.0

    int c = 1;
    int d = c++;
    System.out.println(c);  // 2
    System.out.println(d);  // 1

    // ++ -- 会备份到一个新的空间（看下面的例子解释）
    int e = 1; // 开辟一个e空间，然后在常量池中取出1，赋值给e
    e = e++;  // e++ --> 先备份后++，备份空间e`-->1; 备份成功之后，e空间++变成了2，然后将备份空间的值赋值给e空间
    System.out.println(e); // 1


    // 重点理解一下
    int f = 1;
    for(int i = 1; i <= 100; i ++) {
      f = f++;  // 先备份，在加加
    }

    System.out.println(f); // 1

    int g = 1;
    for(int i = 1; i <= 100; i ++) {
      g = ++g;  // 先加加，在备份
    }

    System.out.println(g); // 101

    // 练习题
    int m = 1;// 210
    int n = 2;// 321
    int sum = m++ + ++ n - n-- - --m + n-- - -- m;
    // 1 3 3 1 2 0
    System.out.println(m);  // 0
    System.out.println(n);  // 1
    System.out.println(sum);  // 2


    // 赋值运算
    byte h = 1;
    h+=2; // 3
    System.out.println(h); // 3
    // 从h变量空间中取出数值  从常量池中取出常量
    // 8bit + 32bit
    // 00000001  00000000 00000000 00000000 00000010
    // 自动补充0 00000000 00000000 00000000 00000011 -> 3
    // 然后从32bit赋值给8bit的byte类型会有损失
    // 上面的+=是一家人，直接给处理了，这种写法是表达式，所以需要强制转换
    // h = h + 2; // 编译会报错，从Int转换成byte会有损失
    h = (byte)(h+2);
    System.out.println(h); // 5

    
  }
}