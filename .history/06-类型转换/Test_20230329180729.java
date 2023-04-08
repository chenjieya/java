public class Test {
  public static void main(String[] args) {
    int a = 1;
    byte b = (byte)a;
    System.out.println(b);

    int c = 1000;
    byte d = (byte)c;  // 有损失 值在byte类型存不下，会切断二进制的值，影响到真实的数据
    System.out.println(d);
  }
}
