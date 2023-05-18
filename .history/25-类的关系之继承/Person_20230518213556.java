public class Person extends Animation {
  public Person() {
    this();
    System.out.println("我是Person类中无参数重载");
  }

  public Person(int a) {
    super();
    System.out.println("我是Person类中参数a的重载");
  }
}
