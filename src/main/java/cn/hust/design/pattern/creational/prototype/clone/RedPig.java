package cn.hust.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 20:16
 **/
public class RedPig implements Cloneable{


    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //当有引用类型时，必须进行深拷贝，否则内部的引用对象仍相同
        RedPig redPig = (RedPig)super.clone();
        redPig.birthday =(Date)redPig.birthday.clone();
        return redPig;
    }

    @Override
    public String toString() {
        return "RedPig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public RedPig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
