import java.util.Scanner;
public class Test {
  public static void main(String[] args) {
    //  1. 不及格 60-70及格 70-80中 80-90良好 90-100优秀 100满分 数据存在错误
    Scanner input = new Scanner(System.in);
    System.out.println("请输入学生的成绩");
    int achievement = input.nextInt();

    switch(achievement / 10) {
      case 6:
        System.out.println("及格");
        break;
        case 7:
        System.out.println("成绩中等");
        break;
        case 8:
        System.out.println("良好");
        break;
        case 9:
        System.out.println("优秀");
        break;
        case 10:
        System.out.println("满分");
        break;
        default
        
    }
  }
}
