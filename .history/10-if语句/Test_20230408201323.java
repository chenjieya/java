import java.util.Scanner;
public class Test {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println("请输入数字，我会输出对应的日期：");
    int day = a.nextInt();
    
    if(day == 1) {
      System.out.println("周一");
    } else if(day == 2) {
      System.out.println("周二");
    } else if(day == 2) {
      System.out.println("周三");
    } else if(day == 2) {
      System.out.println("周四");
    } else if(day == 2) {
      System.out.println("周五");
    } else if(day == 2) {
      System.out.println("周六");
    } else if(day == 2) {
      System.out.println("周日");
    } else {
      System.out.println("有病啊，好好输入");
    }
  }
}
