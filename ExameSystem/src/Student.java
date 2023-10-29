import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生进行答题
 */
public class Student {
    private String username;
    private String password;

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String[] doExam (ArrayList<Subject> paper) {
        String[] answer = new String[paper.size()];

        for (int i = 0; i < paper.size(); i++) {
            System.out.println(paper.get(i).getTitle());
            Scanner inp = new Scanner(System.in);
            answer[i] =  inp.nextLine();
        }

        return answer;
    }

}
