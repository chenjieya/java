public class Animation {
  // public Animation() {
  //   System.out.println("我是Animation中的无参数重载");
  // }

  // public Animation(int a) {
  //   System.out.println("我是Animation中的参数a的重载");
  // }

  public void eat() {
    System.out.println("我是Animation类中的eat方法");
  }

  public void sleep() {
    this.test();
    System.out.println("我是Animation类方法中的sleep方法");
  }

  public void test() {
    System.out.println("我是Animation中的test方法");
  }
}
