package stringClass;

public class Main {
    public static void main(String[] args) {
        /**
         * String 重写的 equals
         * 首先比较的是地址是否相等，如何地址相等则是true
         * 其次判断类型是否数据String类
         * 如果是String类的话，则先将Object类的参数还原成String（多态）
         * 然后在进行比较每一个字符是否相等
         */
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // false
        System.out.println(s4 == s4);  // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
    }
}
