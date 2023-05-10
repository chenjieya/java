public class TestOverload {
  public void test(boolean flag) {
    System.out.println("您输入一个参数:" + flag);
  }

  /**
   * 重载(参数个数、类型、顺序)
   */
  public void test(int a) {
    System.out.println("您输入一个参数:" + a);
  }

  public void test() {
    System.out.println("没有参数:");
  }
}
