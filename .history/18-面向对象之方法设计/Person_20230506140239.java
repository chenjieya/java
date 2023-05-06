public class Person {
  public String name;
  public int age;
  public String sex;

  public void doEat(String food){
    System.out.println("今天吃了" + food);
  }

  public void tellName() {
    System.out.println("你们问我叫什么呀?勉强告诉你们吧");
    return "陈杰"
  }
}
