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
  
 
}
