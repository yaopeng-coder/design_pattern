package cn.hust.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 15:53
 **/
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);

    }
}
