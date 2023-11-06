package view;

import dao.QuestionDao;
import domain.Question;
import domain.QuestionNum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExamFream extends FrameRule {

    // 创建三个面板
    private JPanel mainPanel = new JPanel();
    private JPanel sidePanel = new JPanel();
    private JPanel bottomPanel = new JPanel();

    // 创建答题文本域
    private JTextArea answerTextArea = new JTextArea();
    // 创建滚动条
    private JScrollPane scrollPane = new JScrollPane(answerTextArea);

    // 右侧信息
    private JLabel picLabel = new JLabel();
    private JLabel curNumLabel = new JLabel("当前题号：");
    private JLabel totalCountLabel = new JLabel("题目总数：");
    private JLabel anwserCountLabel = new JLabel("已答题数：");
    private JLabel unAnswerCountLabel = new JLabel("未答题数：");

    private JTextField curNumField = new JTextField("0");
    private JTextField totalCountField = new JTextField("0");
    private JTextField anwserCountField = new JTextField("0");
    private JTextField unAnswerCountField = new JTextField("0");

    private JLabel timeLabel = new JLabel("剩余答题时间");
    private JLabel realTimeLabel = new JLabel();

    // 下方按钮组件
    private JButton Abtn = new JButton("A");
    private JButton Bbtn = new JButton("B");
    private JButton Cbtn = new JButton("C");
    private JButton Dbtn = new JButton("D");
    private JButton prevBtn = new JButton("prev");
    private JButton nextBtn = new JButton("next");
    private JButton submitBtn = new JButton("submit");

    public int questionTotal = 5;

    // 创建一个试卷对象
    private QuestionDao exam = new QuestionDao();

    private ArrayList<Question> paper = exam.getPaper(this.questionTotal);

    // 题号
    private QuestionNum questionNum= new QuestionNum(questionTotal);
    // 答案
    private String[] answer = new String[this.questionTotal];

    // 倒计时时间（分钟）
    private int time = 1;
    private TimeRunable timeRunable = new TimeRunable();

    public ExamFream() {
        this.init();
    }

    public ExamFream(String title) {
        super(title);
        this.init();
    }


    @Override
    protected void setLayoutPosition() {

        // 自定义布局
        mainPanel.setLayout(null);
        sidePanel.setLayout(null);
        bottomPanel.setLayout(null);

        mainPanel.setBackground(Color.LIGHT_GRAY);
        scrollPane.setBounds(16, 10, 650, 450);
        answerTextArea.setFont(new Font("黑体", Font.BOLD, 34));
        answerTextArea.setEnabled(false); // 文本域中得文字不能编辑

        sidePanel.setBounds(680, 10, 300, 550);
        sidePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));


        bottomPanel.setBounds(16, 470, 650, 90);
        bottomPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        picLabel.setBounds(10, 10, 280, 230);
        picLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        // picLabel.setIcon(null);

        curNumLabel.setBounds(40, 270, 100, 30);
        curNumLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        curNumField.setBounds(150, 270, 100, 30);
        curNumField.setFont(new Font("黑体", Font.BOLD, 20));
        curNumField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        curNumField.setEnabled(false);
        curNumField.setHorizontalAlignment(JTextField.CENTER);  // 文字居中

        totalCountLabel.setBounds(40, 310, 100, 30);
        totalCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        totalCountField.setBounds(150, 310, 100, 30);
        totalCountField.setFont(new Font("黑体", Font.BOLD, 20));
        totalCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        totalCountField.setEnabled(false);
        totalCountField.setHorizontalAlignment(JTextField.CENTER);  // 文字居中

        anwserCountLabel.setBounds(40, 350, 100, 30);
        anwserCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        anwserCountField.setBounds(150, 350, 100, 30);
        anwserCountField.setFont(new Font("黑体", Font.BOLD, 20));
        anwserCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        anwserCountField.setEnabled(false);
        anwserCountField.setHorizontalAlignment(JTextField.CENTER);  // 文字居中

        unAnswerCountLabel.setBounds(40, 390, 100, 30);
        unAnswerCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        unAnswerCountField.setBounds(150, 390, 100, 30);
        unAnswerCountField.setFont(new Font("黑体", Font.BOLD, 20));
        unAnswerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        unAnswerCountField.setEnabled(false);
        unAnswerCountField.setHorizontalAlignment(JTextField.CENTER);  // 文字居中


        timeLabel.setBounds(90, 460, 150, 30);
        timeLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        timeLabel.setForeground(Color.BLUE);

        realTimeLabel.setBounds(108, 490, 150, 30);
        realTimeLabel.setFont(new Font("黑体", Font.BOLD, 20));
        realTimeLabel.setForeground(Color.BLUE);

        Abtn.setBounds(40, 10, 120, 30);
        Bbtn.setBounds(190, 10, 120, 30);
        Cbtn.setBounds(340, 10, 120, 30);
        Dbtn.setBounds(490, 10, 120, 30);

        prevBtn.setBounds(40, 50, 100, 30);
        nextBtn.setBounds(510, 50, 100, 30);
        submitBtn.setBounds(276, 50, 100, 30);
        submitBtn.setForeground(Color.RED);
        submitBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        this.drawQuestion();
        curNumField.setText(questionNum.getCurNum() + 1 + "");
        totalCountField.setText(questionNum.getTotalNum() + "");
        anwserCountField.setText(questionNum.getAnswerNum() + "");
        unAnswerCountField.setText(questionNum.getUnAnswerNum() + "");

    }

    @Override
    protected void addLayout() {
        sidePanel.add(picLabel);
        sidePanel.add(curNumLabel);
        sidePanel.add(curNumField);
        sidePanel.add(totalCountLabel);
        sidePanel.add(totalCountField);
        sidePanel.add(anwserCountLabel);
        sidePanel.add(anwserCountField);
        sidePanel.add(unAnswerCountLabel);
        sidePanel.add(unAnswerCountField);

        sidePanel.add(timeLabel);
        sidePanel.add(realTimeLabel);

        bottomPanel.add(Abtn);
        bottomPanel.add(Bbtn);
        bottomPanel.add(Cbtn);
        bottomPanel.add(Dbtn);
        bottomPanel.add(prevBtn);
        bottomPanel.add(nextBtn);
        bottomPanel.add(submitBtn);


        mainPanel.add(scrollPane);
        mainPanel.add(sidePanel);
        mainPanel.add(bottomPanel);

        this.add(mainPanel);

    }

    // 倒计时 内部类
    public class TimeRunable extends Thread {

        private boolean flag = true;

        public void setFlag(boolean falg) {
            this.flag = falg;
        }
        public void run() {
            int hour = time / 60;
            int minute = time % 60;
            int second = 0;

            while(flag) {
                //将 小时 分钟 秒 三个变量内存储的数字进行拼串儿处理
                StringBuilder timeString = new StringBuilder();
                //处理小时
                if(hour>=0 && hour<10){
                    timeString.append("0");
                }
                timeString.append(hour);
                timeString.append(":");
                //处理分钟
                if(minute>=0 && minute<10){
                    timeString.append("0");
                }
                timeString.append(minute);
                timeString.append(":");
                //处理秒
                if(second>=0 && second<10){
                    timeString.append("0");
                }
                timeString.append(second);

                realTimeLabel.setText(timeString.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                //改变
                if(second>0){//秒数还够用
                    second--;
                }else{//秒数已经为0
                    if(minute>0){//分钟还够用
                        minute--;
                        second=59;
                    }else{//分钟为0
                        if(hour>0){//小时还够用
                            hour--;
                            minute=59;
                            second=59;
                        }else{
                            System.out.println("时间截止");
                            //时间显示为红色
                            realTimeLabel.setForeground(Color.RED);
                            ExamFream.this.disableBtn(false);//自己写的方法所有按钮失效
                            prevBtn.setEnabled(false);
                            nextBtn.setEnabled(false);
                            //弹出一个消息框 告诉考试结束 请提交
                            JOptionPane.showMessageDialog(ExamFream.this,"考试结束,请提交试卷");
                            this.setFlag(false);
                        }
                    }
                }

            }
        }
    }

    private void clearBtnColor() {
        Abtn.setBackground(null);
        Bbtn.setBackground(null);
        Cbtn.setBackground(null);
        Dbtn.setBackground(null);
    }

    private void disableBtn(boolean falge) {
        Abtn.setEnabled(falge);
        Bbtn.setEnabled(falge);
        Cbtn.setEnabled(falge);
        Dbtn.setEnabled(falge);
    }

    private int getArrayLength(String[] arr) {
        int count = 0;
        for (String item : arr) {
            if (item != null) {
                count+=1;
            }
        }
        return count;
    }




    public void restoreAnswer() {
        String answer = this.answer[questionNum.getCurNum()];
        if (answer == null) {
            return;
        }

        switch(answer) {
            case "A":
                Abtn.setBackground(Color.YELLOW);
                break;
            case "B":
                Bbtn.setBackground(Color.YELLOW);
                break;
            case "C":
                Cbtn.setBackground(Color.YELLOW);
                break;
            case "D":
                Dbtn.setBackground(Color.YELLOW);
                break;
            default:
                this.clearBtnColor();
                break;
        }

    }

    @Override
    protected void addEventLisenter() {

        submitBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. 先停止时间倒计时
                timeRunable.setFlag(false);
                // 2. 将其他的所有按钮都禁用
                ExamFream.this.disableBtn(false);
                prevBtn.setEnabled(false);
                nextBtn.setEnabled(false);;
                // 3. 计算出成绩

            }
        });

        prevBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExamFream.this.clearBtnColor();
                nextBtn.setEnabled(true);;
                ExamFream.this.disableBtn(true);

                // 当前题目-1
                int curNum = ExamFream.this.questionNum.getCurNum();
                curNum--;
                ExamFream.this.questionNum.setCurNum(curNum);

                if (ExamFream.this.questionNum.getCurNum() == 0) { // 第一题
                    prevBtn.setEnabled(false);
                }
                ExamFream.this.drawQuestion();
                // 还原选择的答案
                ExamFream.this.restoreAnswer();
                curNumField.setText(questionNum.getCurNum() + 1 + "");
                anwserCountField.setText(questionNum.getAnswerNum() + "");
                unAnswerCountField.setText(questionNum.getUnAnswerNum() + "");
            }
        });

        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExamFream.this.clearBtnColor();
                prevBtn.setEnabled(true);

                // 当前题目+1
                int curNum = ExamFream.this.questionNum.getCurNum();
                curNum++;
                ExamFream.this.questionNum.setCurNum(curNum);

                if (ExamFream.this.questionNum.getCurNum() == ExamFream.this.questionTotal) { // 最后一题
                    answerTextArea.setText("全部题目回答完毕，请及时提交试卷");
                    nextBtn.setEnabled(false);


                    // 让全部选项按钮颜色制空，选项不可用
                    ExamFream.this.clearBtnColor();
                    ExamFream.this.disableBtn(false);
                } else{
                    ExamFream.this.drawQuestion();
                    // 还原选择的答案
                    ExamFream.this.restoreAnswer();
                    curNumField.setText(questionNum.getCurNum() + 1 + "");
                }

                anwserCountField.setText(questionNum.getAnswerNum() + "");
                unAnswerCountField.setText(questionNum.getUnAnswerNum() + "");
            }
        });



        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 先将所有的颜色清空
                ExamFream.this.clearBtnColor();

                JButton button = (JButton)e.getSource();
                button.setBackground(Color.YELLOW);

                // 将点击的答案存储到数组中
                answer[questionNum.getCurNum()] = button.getText();
                int answerLength = ExamFream.this.getArrayLength(answer);
                ExamFream.this.questionNum.setAnswerNum(answerLength);
            }
        };

        Abtn.addActionListener(listener);
        Bbtn.addActionListener(listener);
        Cbtn.addActionListener(listener);
        Dbtn.addActionListener(listener);

    }

    @Override
    protected void frameSelf() {
        this.setBounds(260, 130, 1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        timeRunable.start();
    }

//    public static void main(String[] args) {
//        new ExamFream("考试窗口");
//    }

    //设计一个方法 用来处理图片展示
    private ImageIcon drawImage(String path){
        //通过给定的路径创建一个icon对象
        ImageIcon imageIcon = new ImageIcon(path);
        //设置imageIcon对象内的image属性
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(280,230,Image.SCALE_DEFAULT));
        //将设置好的imageIcon对象返回
        return imageIcon;
    }

    public void drawQuestion() {
        Question ques = paper.get(questionNum.getCurNum());
        String title = ques.getQuestion();  // 题干
        String imgPath = ques.getImgPath();
        if (imgPath != null) {
            // 有图片
            picLabel.setIcon(this.drawImage("src//img//"+imgPath));
        } else{
            picLabel.setIcon(null);
        }
        // 没有图片
        answerTextArea.setText((questionNum.getCurNum() + 1) + "." +title.replace("<br>", "\n"));

    }
}
