public class Test {
  public String name;
  public int age;
  public String sex;
  public void eat() {

  }

   /**
   * 构造方法
   * 权限修饰符 与类名一样的名字（参数列表） 【异常】方法体
   */
  public Test() {} // 重载
  public Test(String name, int age, String sex) {
    System.out.println("构造方法默认存在，相当于js的constructor");
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  /**
   * 块（类似于方法，不过，无参数，无返回值，无名字，无修饰符）
   * 每一次在我们调用构造方法之前，系统内部帮我们执行一次
   */
  {
    System.out.println("我是一个普通的程序块");
  }
 
}
