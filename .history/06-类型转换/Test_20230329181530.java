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
    int g = (int)f;
    System.out.println(g);
  }
}
