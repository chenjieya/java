package test;

import Server.LoginServe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {

        // 创建窗体
        JFrame frame = new JFrame("登录窗口");

        // 创建一个面板
        JPanel panel = new JPanel();

        // 创建一个Title
        JLabel title = new JLabel("在 线 考 试 系 统");
        // 用户名
        JLabel account = new JLabel("账 号：");
        // 密码
        JLabel pwd = new JLabel("密 码：");

        // 账号输入框
        JTextField accountField = new JTextField();
        // 密码输入框
        JPasswordField passwordField = new JPasswordField();

        // 登录按钮
        JButton loginBtn = new JButton("登 录");
        // 退出按钮
        JButton exitBtn = new JButton("退 出");

        // 布局
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



        // 将组件添加到窗体
        panel.add(title);
        panel.add(account);
        panel.add(accountField);
        panel.add(pwd);
        panel.add(passwordField);
        panel.add(loginBtn);
        panel.add(exitBtn);

        frame.add(panel);

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
                } else {
                    // 弹出错误提示框
                    JOptionPane.showMessageDialog(frame, result);
                    // 清空账号和密码
                    accountField.setText("");
                    passwordField.setText("");
                }
            }
        };
         loginBtn.addActionListener(listener);
         exitBtn.addActionListener(listener);


        // 设置窗口起始位置和大小
        frame.setBounds(1000, 550, 560, 340);
        // 设置点击关闭退出程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗体大小不可拖拽
        frame.setResizable(false);
        // 设置窗体状态为显示
        frame.setVisible(true);

    }
}
