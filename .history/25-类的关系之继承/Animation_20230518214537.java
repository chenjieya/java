public class Animation {
  // public Animation() {
  //   System.out.println("我是Animation中的无参数重载");
  // }

  // public Animation(int a) {
  //   System.out.println("我是Animation中的参数a的重载");
  // }

  public void eat() {
    
  }

  public void sleep() {
    this.eat();
    System.out.println("我是Animation类方法中的sleep方法");
  }
}
