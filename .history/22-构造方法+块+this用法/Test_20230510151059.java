public class Test {
  public String name;
  public void eat() {

  }

  public static void main(String[] args){
    Test t = new Test();
    System.out.println(t);
  }
 
  /**
   * 构造方法
   * 权限修饰符 与类名一样的名字（参数列表） 【异常】方法体
   */
  public Test() {
    System.out.println("构造方法默认存在，相当于js的constructor");
  }
}
