public class TestOverload {
  public void test(boolean flag) {
    System.out.println("您输入一个参数:" + flag);
  }

  /**
   * 重载
   */
  public void test(int a) {
    System.out.println("您输入一个参数:" + a);
  }
}
