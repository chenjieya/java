/**
 * 生成题目
 */
public class Subject {
    private String title;
    private String answer;

    public Subject (String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAnswer() {
        return this.answer;
    }

    // 重写equals方法
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Subject) {
            Subject another = (Subject) obj;
            return this.title.equals(another.title);
        }

        return false;
    }

    // 重写hashCode方法
    public int hashCode() {
        return this.title.hashCode();
    }

}
