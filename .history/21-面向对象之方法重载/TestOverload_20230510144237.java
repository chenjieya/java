public class TestOverload {
  public void test(boolean flag) {
    System.out.println("您输入一个参数:" + flag);
  }

  /**
   * 重载(参数个数、类型、顺序)
   * 如果找到参数类型一致的，直接进方法
   * 如果没有，他会将参数转换一下，自动转换
   */
  public void test(int a) {
    System.out.println("您输入一个参数:" + a);
  }

  public void test() {
    System.out.println("没有参数:");
  }

  public void test(String s) {
    System.out.println("您输入一个参数:" + s);
  }

  /**
   * 在jdk1.5之后出现了新的写法
   */
}
