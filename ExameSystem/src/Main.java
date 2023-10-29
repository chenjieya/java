import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 考试机 -> 题库  并随机生成试卷
        // 学生 -> 拿到试卷 考试 返回答案
        // 老师 -> 拿到试卷和答案  返回分数

        ExameMatchier exam = new ExameMatchier();  // 创建考试机
        ArrayList<Subject> paper = exam.randomExam();  // 随机生成一套卷子

        Scanner inp =  new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String accout = inp.nextLine();
        System.out.println("请输入密码：");
        String pwd = inp.nextLine();

        Student stu = new Student(accout, pwd);   // 创建一个学生

        String login = exam.LoginMethod(stu.getUsername(), stu.getPassword());  // 登录

        if (login.equals("登录成功")) {
            System.out.println("登录成功\n");
            String[] answer = stu.doExam(paper);  // 学生答题
            Teacher teacher = new Teacher();
            int score = teacher.gradPaper(paper, answer);

            System.out.println(stu.getUsername() + " 考试结束，你的分数是：" + score);
        }




    }
}