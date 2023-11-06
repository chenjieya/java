package domain;

public class QuestionNum {
    // 当前题号
    private int curNum = 0;
    // 题目总数
    private int totalNum;
    // 已答题数
    private int answerNum = 0;
    // 未答题数
    private int unAnswerNum;

    public QuestionNum(int num) {
        this.totalNum = num;
        this.unAnswerNum = num;
    }

    public void setCurNum(int num) {
        if (num < 0) {
            this.curNum = 0;
            return;
        }
        this.curNum = num;
    }

    public int getCurNum() {
        return curNum;
    }

    public int getAnswerNum() {
        return answerNum;
    }

    public void setAnswerNum(int answerNum) {
        this.answerNum = answerNum;
        this.setUnAnswerNum(this.totalNum - this.answerNum);
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getUnAnswerNum() {
        return unAnswerNum;
    }

    public void setUnAnswerNum(int unAnswerNum) {
        this.unAnswerNum = unAnswerNum;
    }
}
