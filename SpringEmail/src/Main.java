import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class Main {
    public static void main(String[] args) throws MessagingException {
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        JavaMailSender sender = (JavaMailSender)factory.getBean("sender");
        // 创建一个邮件对象
        MimeMessage mimeMessage = sender.createMimeMessage();
        // 发送这个邮件 找小弟帮忙
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
        // 告知发送给谁 发什么
        mimeMessageHelper.setFrom("2959508594@qq.com");
        mimeMessageHelper.setTo("18822126754@163.com");
        mimeMessageHelper.setSubject("测试邮件");
        mimeMessageHelper.setText("基于Spring发送邮件");

        // 直接发送消息
        sender.send(mimeMessage);
        System.out.println("发送成功");
    }
}