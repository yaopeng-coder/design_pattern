package cn.hust.design.pattern.creational.prototype;

/**
 * 原型模式
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 20:03
 **/
public class Mail implements Cloneable {

    private String content;
    private String emailAddress;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "content='" + content + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", name='" + name + '\'' +
                '}'+super.toString();
    }

    public Mail() {
        System.out.println("调用构造器");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
