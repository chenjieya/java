import java.util.*;

/**
 * 考试机
 * 添加题目 随机生成试卷
 */
public class ExameMatchier {

    private HashMap<String, String> userInfo = new HashMap<>();

    {
        userInfo.put("alvis", "666");
    }

    private HashSet<Subject> sub = new HashSet<>();

    {
        sub.add(new Subject("测试题目正确答案A？\nA:正确 \nB:错误", "A"));
        sub.add(new Subject("测试题目，正确答案A？\nA:正确 \nB:错误", "A"));
        sub.add(new Subject("测试题目正确答案B？\nA:正确 \nB:错误", "B"));
        sub.add(new Subject("测试题目？正确答案B\nA:正确 \nB:错误", "B"));
        sub.add(new Subject("测试题目？正确答案A\nA:正确 \nB:错误", "A"));
        sub.add(new Subject("正确答案A测试题目？\nA:正确 \nB:错误", "A"));
        sub.add(new Subject("正确答案B测试题目？\nA:正确 \nB:错误", "B"));
        sub.add(new Subject("测试正确答案B题目？\nA:正确 \nB:错误", "B"));
        sub.add(new Subject("测试正确答案A题目？\nA:正确 \nB:错误", "A"));
        sub.add(new Subject("测试题正确答案B目？\nA:正确 \nB:错误", "B"));
    }

    public ArrayList<Subject> randomExam() {
        System.out.println("考试机正在随机抽取五道题目。。。");;
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

        // 随机抽取五道题目  抽取道得题目不能是相同得
        HashSet<Subject> paper = new HashSet<>();  // 试卷
        ArrayList<Subject> exam = new ArrayList<>(this.sub);  // 题库

        while(paper.size() < 5) {
            int index = new Random().nextInt(this.sub.size());  // [0, 10)
            paper.add(exam.get(index));
        }

        return new ArrayList<Subject>(paper);
    }

    public HashSet<Subject> getSub() {
        return sub;
    }

    public String LoginMethod(String username, String password) {
        String realName = this.userInfo.get(username);
        if (realName != null && realName.equals(password)) {
            return "登录成功";
        }

        return "登录失败";
    }
}
