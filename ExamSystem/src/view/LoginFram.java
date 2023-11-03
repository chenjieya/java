package view;

import Server.LoginServe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFram extends FrameRule {
    // 创建一个面板
    private JPanel panel = new JPanel();

    // 创建一个Title
    private JLabel title = new JLabel("在 线 考 试 系 统");
    // 用户名
    private JLabel account = new JLabel("账 号：");
    // 密码
    private JLabel pwd = new JLabel("密 码：");

    // 账号输入框
    private JTextField accountField = new JTextField();
    // 密码输入框
    private JPasswordField passwordField = new JPasswordField();

    // 登录按钮
    private JButton loginBtn = new JButton("登 录");
    // 退出按钮
    private JButton exitBtn = new JButton("退 出");

    public LoginFram() {
        this.init();
    }
    public LoginFram(String title) {
        super(title);
        this.init();
    }

    // 布局
    public void setLayoutPosition() {
        panel.setLayout(null);  // 设置为自定义布局
        // 设置每个组件的位置
        title.setBounds(145, 40, 340, 35);
        title.setFont(new Font("黑体", Font.BOLD, 30));

        account.setBounds(94, 124, 90, 30);
        account.setFont(new Font("黑体", Font.BOLD, 24));

        accountField.setBounds(204, 124, 260, 30);
        accountField.setFont(new Font("黑体", Font.BOLD, 24));

        pwd.setBounds(94, 174, 90, 30);
        pwd.setFont(new Font("黑体", Font.BOLD, 24));

        passwordField.setBounds(204, 174, 260, 30);
        passwordField.setFont(new Font("黑体", Font.BOLD, 24));

        loginBtn.setBounds(154, 232, 100, 30);
        loginBtn.setFont(new Font("黑体", Font.BOLD, 22));

        exitBtn.setBounds(334, 232, 100, 30);
        exitBtn.setFont(new Font("黑体", Font.BOLD, 22));
    }

    // 添加组件
    public void addLayout() {
        panel.add(title);
        panel.add(account);
        panel.add(accountField);
        panel.add(pwd);
        panel.add(passwordField);
        panel.add(loginBtn);
        panel.add(exitBtn);

        this.add(panel);
    }

    // 绑定事件
    public void addEventLisenter() {
        // 绑定事件
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. 获取到用户名和密码
                String accout = accountField.getText();
                char[] pwd = passwordField.getPassword();
                String password = new String(pwd);
                // 2. 登录
                LoginServe login = new LoginServe();
                String result = login.loginMethod(accout, password);
                if (result.equals("登录成功")) {
                    // 进入到考试页面
                    System.out.println("登录成功");
                    LoginFram.this.setVisible(false);
                    new ExamFream("考试窗口");
                } else {
                    // 弹出错误提示框
                    JOptionPane.showMessageDialog(LoginFram.this, result);
                    // 清空账号和密码
                    accountField.setText("");
                    passwordField.setText("");
                }
            }
        };
        loginBtn.addActionListener(listener);
        exitBtn.addActionListener(listener);
    }

    // 窗口自身设置
    public void frameSelf() {
        // 设置窗口起始位置和大小
        this.setBounds(1000, 550, 560, 340);
        // 设置点击关闭退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体大小不可拖拽
        this.setResizable(false);
        // 设置窗体状态为显示
        this.setVisible(true);
    }

}
