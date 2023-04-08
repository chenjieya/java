public class Test {
  public static void main(String[] args) {
    int a = 1;
    byte b = (byte)a;
    System.out.println(b);

    int c = 1000;
    byte d = (byte)c;  // 有损失 值在byte类型存不下，会切断二进制的值，影响到真实的数据
    System.out.println(d);

    float e = c;  // 精度比较，小的转换大的直接转换
    System.out.println(e);

    float f = 3.4F;
    int g = (int)f;  // 强制转换
    System.out.println(g);  // 3

    char x = 'a'; // 二进制-->十进制
    int y = x;
    System.out.println(y);  // 97

    int w = 97; // 32bit -> 16bit 大的转换成小的 会有损失
    char k = (char)w;  // 强制转换
    System.out.println(k); // a

    byte l = 97;  // 8bit --> 16bit 在转换过程中会先变成32bit或者64bit  然后在往后进行操作  会有损失
    char n = (char)l;  // 强制转换
    System.out.println(n);  // a

    char j = '我';
    int v = j;
    System.out.println(v);  // 25105  21916 27426  20320 26446 33298 28103

    int wo = 25105;
    char woc = (char)wo;
    System.out.println(woc);  // 我

    int xi = 21916;
    char xic = (char)xi;
    System.out.println(xic);  // 喜

    int huan = 27426;
    char huanc = (char)huan;
    System.out.println(huanc);  // 欢

    int ni = 20320;
    char nic = (char)ni;
    System.out.println(nic); // 你

    int li = 26446;
    char lic = (char)li;
    System.out.println(lic);  // 李

    int shu = 33298;
    char shuc = (char)shu;
    System.out.println(shuc);  // 舒

    int qi = 28103;
    char qic = (char)qi;
    System.out.println(qic);  // 淇

  }
}
