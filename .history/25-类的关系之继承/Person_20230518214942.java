public class Person extends Animation {
  // 重载中的this，只能调用另一个重载。但是在重载的默认第一行，写了super()调用了父类的重载
  // public Person() {
  //   this(123);
  //   System.out.println("我是Person类中无参数重载");
  // }

  // public Person(int a) {
  //   System.out.println("我是Person类中参数a的重载");
  // }
  
  public void eat() {
    super.test();
    System.out.println("我是Person类中的eat方法");
  }
}
