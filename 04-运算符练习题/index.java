import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        // 两个变量 int a = 1; int b = 2; 交换变量
        int a = 1; int b = 2;
        int c = a;
        a = b;
        b = c; nb 
        System.out.println(a); // 2
        System.out.println(b); // 1

        int d = 1; int f = 2;
        d = d + f;
        f = d - f;
        d = d - f;
        System.out.println(d); // 2
        System.out.println(f); // 1

        System.out.println("请输入一个数字，我来输出对应的季节：");
        Scanner input = new Scanner(System.in);
        int spr = input.nextInt();  // 读取整数
        if (spr == 3 | spr == 4 | spr == 5) {
            System.out.println("春天");
        } else{
            System.out.println("别乱输入");
        }
    }
}