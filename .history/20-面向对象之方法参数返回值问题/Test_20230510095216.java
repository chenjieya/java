public class Test {
  public void changeNum(int x) {
    System.out.println("方法执行开始："+ x);
    x = 10;
    System.out.println("方法执行最终："+ x);
  }

  public static void main(String[] args) {
    Test t = new Test();
  }
}
