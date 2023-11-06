package dao;

import domain.Question;
import utils.MySpring;
import utils.QuestionFileReader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class QuestionDao {

    private QuestionFileReader question = MySpring.getBean("utils.QuestionFileReader");


    public ArrayList<Question> getPaper(int count) {
        ArrayList<Question> paper = new ArrayList<>(question.getQuestionBox());  // 题库

        // 随机抽取题目，但是题目不能重复
        HashSet<Question> exam = new HashSet<>();  // 存储题目

        while(exam.size() < count) {
            int num = new Random().nextInt(paper.size());
            exam.add(paper.get(num));
        }


        return new ArrayList<>(exam);
    }

//    public static void main(String[] args) {
//        ArrayList<Question> paper = new QuestionDao().getPaper(5);
//
//        for (int i = 0; i < paper.size(); i ++) {
//            System.out.println((i+1)+"."+paper.get(i).getQuestion().replace("<br>", "\n"));
//        }
//    }

}
