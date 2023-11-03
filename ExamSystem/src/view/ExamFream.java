package view;

import javax.swing.*;
import java.awt.*;

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
    private JLabel realTimeLabel = new JLabel("00:00:00");

    // 下方按钮组件
    private JButton Abtn = new JButton("A");
    private JButton Bbtn = new JButton("B");
    private JButton Cbtn = new JButton("C");
    private JButton Dbtn = new JButton("D");
    private JButton prevBtn = new JButton("prev");
    private JButton nextBtn = new JButton("next");
    private JButton submitBtn = new JButton("submit");

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

    @Override
    protected void addEventLisenter() {

    }

    @Override
    protected void frameSelf() {
        this.setBounds(260, 130, 1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

//    public static void main(String[] args) {
//        new ExamFream("考试窗口");
//    }
}
