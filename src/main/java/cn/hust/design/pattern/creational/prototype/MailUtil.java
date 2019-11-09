package cn.hust.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 20:05
 **/
public class MailUtil {

    public static void sendMail(Mail mail){
        String message = "发送名字{1}，发送内容{2}，发送地址{3}";
        System.out.println( MessageFormat.format(message,mail.getName(),mail.getContent(),mail.getEmailAddress()));
    }

    public static void saveMail(Mail mail){
        System.out.println(mail.getContent());
    }
}
