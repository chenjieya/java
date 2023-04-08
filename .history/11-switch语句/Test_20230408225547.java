import java.util.Scanner;
public class Test {
  public static void main(String[] args) {
    //  1. 不及格 60-70及格 70-80中 80-90良好 90-100优秀 100满分 数据存在错误
    Scanner input = new Scanner(System.in);
    System.out.println("请输入学生的成绩");
    int achievement = input.nextInt();

    switch(achievement) {
      case achievement<60:
        System.out.println("成绩不及格");
        break;
        case achievement>=60 && achievement<70:
        System.out.println("成绩不及格");
        break;
        case achievement>=70 && achievement<80:
        System.out.println("成绩不及格");
        break;
    }
  }
}
