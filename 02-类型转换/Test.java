public class Test{
    public static void main(String[] args) {
        // byte->int(自动)
        byte x = 1;
        int y = x;
        System.out.println(y);  // 1

        // int -> byte(强制转换)
        int a = 1;
        byte b = (byte)a;
        System.out.println(b);  // 1

        // 不会报错，但是数值会变，只保留最后8bit
        int c = 1000;
        byte d = (byte)c;
        System.out.println(d);  // -24

        long e = 1790546758976L;
        int f = (int)e;
        System.out.println(f);

        // int->float(比较的是精确程度，并不是内存大小， float精度大于整数型)
        int g = 3;
        float h = g;
        System.out.println(h);  // 3.0

        // long是64bit，float是32bit。转换的时候没有报错，说明比较的是精度而不是内存大小
        long i = 50;
        float j = i;
        System.out.println(j);  // 50.0

        float aa = 1.0F;
        int bb = (int)aa;
        System.out.println(bb);

        // 截掉小数点后面
        float dd = 1.9F;
        int ee = (int)dd;
        System.out.println(ee);

        // char->int
        char ff = 'a';
        int gg = ff;
        System.out.println(gg);  // 97

        // byte -> char
        byte hh = 97;
        char ii = (char)hh;
        System.out.println(ii);  // a

        // 布尔类型不能发生转化
    }
}