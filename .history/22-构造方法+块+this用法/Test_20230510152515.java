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
  public Test(String name, int ag, String sex) {
    System.out.println("构造方法默认存在，相当于js的constructor");
    this.name = name;
    this.age = ag;
    this.sex = sex;
  }

  public static void main(String[] args){
    Test t = new Test("陈杰",18,'男');
    System.out.println("姓名："+ t.name + "年龄：" + t.age + "性别：" + t.sex);
  }
 
}
