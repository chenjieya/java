public class Main {
    public static void main(String[] args) {
        /**
         * String的介绍
         * contains 判断给定的字符串在字符串中是否存在
         * endsWith  判断是否以某个字符结尾
         * startsWith 判断是否以什么开头
         * getBytes 将字符串转换成数组 byte类型的数组
         * toCharArray  将字符串转换成数组 char类型的数组
         * indexOf  找第一个对应字符的索引（包括给定的索引）
         * lastIndexOf  从后往前找，找到第一个对应字符索引的位置（包括给定的数组）
         * isEmpty  判断字符串是否为空“”,注意是空串，不是null
         * replace  所有出现的都能替换和replaceAll一样
         * replaceAll   所有出现的都能替换
         * replaceFirst 只还第一个匹配的元素
         * split    按照给定的表达式将原来的字符串拆分
         * substring    截取某个范围内的字符串(索引左闭右开、不包括右边的索引)
         * toLowCase
         * toUpperCase
         * trim
         */

        String a = "abcde";
        Boolean b = a.contains("cd");
        System.out.println(b);

        String c = "Java基础知识";
        Boolean d = c.startsWith("Java");
        System.out.println(d);

        String e = "abc";
        char[] f = e.toCharArray();
        System.out.println(f);
        byte[] g = e.getBytes();
        for (byte v:g) {
            System.out.println(v);
        }

        String h = "abcdefgabcdefg";
        int i = h.indexOf("d", 3);
        System.out.println(i);
        int j = h.lastIndexOf("a");
        System.out.println(j);  // 7
        int k = h.lastIndexOf("a", 6);
        System.out.println(k);  // 0

        String l = "我一定能认真的学完所有知识yayaya";
        l = l.replace("我", "我们");
        System.out.println(l); //我们一定能认真的学完所有知识
        l = l.replaceAll("ya", "鸭");
        System.out.println(l); // 我们一定能认真的学完所有知识鸭鸭鸭

        String m = "abcdefghijklmn";
        String n = m.substring(3);
        System.out.println(n); // defghijklmn
        String o = m.substring(3,6);
        System.out.println(o);  // def
    }
}
