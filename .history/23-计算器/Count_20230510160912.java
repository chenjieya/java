public class Count {
  public int num1;
  public int num2;
  public int total;

  /**
   * 构造函数
   */
  public Count() {}

  /**
   * 加法
   */
  public int add(int a, int b) {
    this.num1 = a;
    this.num2 = b;
    this.total = this.num1 + this.num2;
  }
}
