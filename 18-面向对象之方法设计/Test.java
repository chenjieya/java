public class Test {
  public static void main(String[] args) {
    Person p = new Person();
    p.name = "陈杰";
    p.age = 18;
    p.doEat("香蕉");

    String name = p.tellName();
    System.out.println(name);

    p.drawStart();
  }
}
