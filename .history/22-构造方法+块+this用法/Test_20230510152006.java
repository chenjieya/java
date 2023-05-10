public class Test {
  public String name;
  public int age;
  public String sex;
  public void eat() {

  }

  public static void main(String[] args){
    Test t = new Test("");
    System.out.println(t);
  }
 
  /**
   * 构造方法
   * 权限修饰符 与类名一样的名字（参数列表） 【异常】方法体
   */
  public Test() {} // 重载
  public Test(String name, int age, String sex) {
    System.out.println("构造方法默认存在，相当于js的constructor");
    name = name;
    age = age;
    sex = sex;
  }
}
