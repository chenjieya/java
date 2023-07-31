package stringClass;

public class Main {
    public static void main(String[] args) {
        /**
         * String
         *
         * String构造函数很多，可以去官网看
         *
         *
         * String的不可变特性
         *
         *
         * 常用方法：
         * equals
         * hashCode equals方法重写的时候一般都会伴随这hashCode的重写
         * compareTo  用短的字符循环，第一位和第一位比较，相等则比较后面的，不相等则按照字符的字段相减（短的字段-长的字符）/如果长度不统一还都相等，则用长度相减/如果长度统一都相等则返回0
         * toString
         *
         * char a = charAt(int index)  // 给定index返回索引对应得char
         * int a = codePointAt(int index) // 返回char对应得code码
         *
         * length() 返回字符串得长度
         *
         * concat() // 字符串拼接
         * StringBuffer对象，像以前自己封装得ArrayBox，这个频繁拼接得效率更高
         */
        byte[] bt = new byte[]{65,97,48};
        String a = new String(bt); // Aa0
        System.out.println(a);


        char[] ch = new char[]{'A', 'a', '0'};
        String b = new String(ch); // Aa0
        System.out.println(b);

        String c = "a";
        c = c.concat("bcde");
        System.out.println(c);


    }
}
