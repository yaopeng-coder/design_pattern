package cn.hust.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:26
 **/
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question)arg;
        System.out.println(this.teacherName+"已经收到"+course.getCourseName()+question.getUserName()+"提出的"+question.getQuestionContent());

    }
}
