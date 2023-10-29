import java.util.ArrayList;

/**
 * 老师进行判卷子
 */
public class Teacher {


    public int gradPaper(ArrayList<Subject> paper, String[] anwser) {
        int score = 0;

        for (int i = 0; i < paper.size(); i++){
            String paperItem = paper.get(i).getAnswer();  // 正确答案
            String anwserItem = anwser[i];  // 学生答案

            if (paperItem.equalsIgnoreCase(anwserItem)) {
                score += 100 / paper.size();
            }
        }

        return score;
    }

}
