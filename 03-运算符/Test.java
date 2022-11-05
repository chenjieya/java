public class Test {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        int sum = m++ + ++n - n-- - --m + n-- - --m;
        //m 1 2
        //n 3 3
        //n 3 2
        //m 1 1
        //n 2 1
        //m 0 0

        // m = 0; n = 1; sum = 2;
        System.out.println(m);
        System.out.println(n);
        System.out.println(sum);

        /*
        * i = i++（先运算后加加）
        * 1。先在栈内存中开辟一个临时内存空间，备份i的值
        * 2。然后i自身加1并赋值给i
        * 3。最后在将备份的值赋值给i
        *
        *
        * i = ++i;相反
        * */
    }
}