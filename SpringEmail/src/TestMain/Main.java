package TestMain;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Main {

    private static Message createMessage(Session session) throws MessagingException {
        // 自己创建一个邮件对象
        Message message = new MimeMessage(session);

        // 设置邮件基本信息
        // 设置发送人
        message.setFrom(new InternetAddress("2959508594@qq.com"));
        // 设置收件人 收件人To 抄送人CC 密送BCC
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("18822126754@163.com"));
        // 设置发送邮件的时间
        message.setSentDate(new java.util.Date());
        // 设置发送主题
        message.setSubject("这是邮件的主题");
        // 设置发送邮件的正文
        message.setText("这是邮件的正文,通过JAVA的mail包发送的");

        // 以上所有的设置需要保存才能生效
        message.saveChanges();
        return message;
    }

    public static void main(String[] args) throws MessagingException {
        // 1. 下载一个main.jar
        // 2. 导包
        // 3. 创建一个用于存放配置信息的对象，Properties类型
        Properties props = new Properties();
        // 4. 设置发送邮件需要的一些信息
        // 设置发送邮件的协议
        props.put("mail.transport.protocol", "smtp");
        // 设置发送邮件的主机名
        props.put("mail.smtp.host", "smtp.qq.com");
        // SMTP服务器是否需要用户认证
        props.put("mail.smtp.auth", "true");
        // qqsmtp端口 465
        props.put("mail.smtp.port", "465");
        // 使用ssl
        props.put("mail.smtp.ssl.enable", "true");

        // 5. 创建一个Session对象（可以理解为一个Socket，Java与邮箱之间建立连接）
        Session session = Session.getDefaultInstance(props);

        // 6. 通过session对象获取一个Transport对象（可以理解为一个输出流）
        Transport ts = session.getTransport();

        // 7. 想要通过邮箱发送邮件，必须得到邮箱服务器的认证
        ts.connect("2959508594@qq.com","ecymsqlwyemlddcd");

        // 8. 创建邮件
        Message message = createMessage(session);

        // 9. 发送邮件
        ts.sendMessage(message, message.getAllRecipients());

        // 10. 关闭连接
        ts.close();

        System.out.println("发送完毕");
    }

}
