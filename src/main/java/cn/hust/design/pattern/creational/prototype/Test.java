package cn.hust.design.pattern.creational.prototype;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 20:10
 **/
public class Test {


    public static void main(String[] args) throws CloneNotSupportedException {

        Mail mail = new Mail();
        mail.setContent("我只是个模板");
        System.out.println(mail);
        for(int i = 0; i<5;i++){
            Mail mailTemp = (Mail)mail.clone();
            mailTemp.setName("同学"+i);
            mailTemp.setContent("你中奖了" );
            mailTemp.setEmailAddress("hust");
            System.out.println(mailTemp);
            MailUtil.sendMail(mailTemp);
        }
        MailUtil.saveMail(mail);
    }
}
