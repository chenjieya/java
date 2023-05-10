public class Index{
  public static void main(String[] args){
    Test t = new Test("陈杰", 18, "男");
    Test tb = new Test("陈杰", 18, "男");
    System.out.println("姓名："+ t.name + "年龄：" + t.age + "性别：" + t.sex);
  }
}
