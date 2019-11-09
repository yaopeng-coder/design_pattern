package cn.hust.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 20:18
 **/
public class Test {


    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        RedPig redPig = new RedPig("xiaozhu",birthday);
        RedPig pigclone = (RedPig)redPig.clone();
        System.out.println(redPig);
        System.out.println(pigclone);

        pigclone.getBirthday().setTime(8888888888888L);
        System.out.println(redPig);
        System.out.println(pigclone);

    }
}
