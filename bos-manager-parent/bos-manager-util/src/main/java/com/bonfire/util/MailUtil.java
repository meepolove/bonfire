package com.bonfire.util;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created by Administrator on 2018/11/6.
 */
public class MailUtil {
    private static String mailHost = "smtp.126.com";
    private static String mailPort = "25";
    private static String fromMail = "meepolove@126.com";
    private static String password = "WQ@186019";
    private static String toMail = "352296901@qq.com";

    public static void main(String[] args) throws MessagingException {
        Properties pro = System.getProperties();
        pro.put("mail.smtp.host", mailHost);
        pro.put("mail.smtp.port", mailPort);
        pro.put("mail.smtp.auth", "true");

        // 根据邮件会话属性和密码验证器构造一个发送邮件的session
        Session sendMailSession = Session.getDefaultInstance(pro,
                new Authenticator()
                {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication(fromMail, password);
                    }
                });
        // 根据session创建一个邮件消息
        Message mailMessage = new MimeMessage(sendMailSession);
        // 设置邮件消息的发送者
        mailMessage.setFrom(new InternetAddress(fromMail));
        // 创建邮件的接收者地址，并设置到邮件消息中
        mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
        //mailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("李四@qq.com"));  //设置收件人（抄送）
        //mailMessage.addRecipient(Message.RecipientType.BCC, new InternetAddress("王五@163.com"));//设置收件人（暗送）
        // 设置邮件消息的主题
        mailMessage.setSubject("垃圾邮件,自动忽视");
        // 设置邮件消息发送的时间
        mailMessage.setSentDate(new Date());
        // 设置邮件消息的主要内容
        mailMessage.setText("this is a test Text mail 垃圾中的垃圾");
        // 发送邮件
        Transport.send(mailMessage);
    }

    //发送邮件
//    public static void sendMail(String toMail,String subject,String content) throws MessagingException {
//        Properties pro = System.getProperties();
//        pro.put("mail.smtp.host", mailHost);
//        pro.put("mail.smtp.port", mailPort);
//        pro.put("mail.smtp.auth", "true");
//
//        // 根据邮件会话属性和密码验证器构造一个发送邮件的session
//        Session sendMailSession = Session.getDefaultInstance(pro,
//                new Authenticator()
//                {
//                    @Override
//                    protected PasswordAuthentication getPasswordAuthentication()
//                    {
//                        return new PasswordAuthentication(fromMail, password);
//                    }
//                });
//        // 根据session创建一个邮件消息
//        Message mailMessage = new MimeMessage(sendMailSession);
//        // 设置邮件消息的发送者
//        mailMessage.setFrom(new InternetAddress(fromMail));
//        // 创建邮件的接收者地址，并设置到邮件消息中
//        mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
//        //mailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("李四@qq.com"));  //设置收件人（抄送）
//        //mailMessage.addRecipient(Message.RecipientType.BCC, new InternetAddress("王五@163.com"));//设置收件人（暗送）
//        // 设置邮件消息的主题
//        mailMessage.setSubject("垃圾邮件,自动忽视");
//        // 设置邮件消息发送的时间
//        mailMessage.setSentDate(new Date());
//        // 设置邮件消息的主要内容
//        mailMessage.setText("this is a test Text mail 垃圾中的垃圾");
//        // 发送邮件
//        Transport.send(mailMessage);
//    }
}
