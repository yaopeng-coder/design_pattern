package cn.hust.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:11
 **/
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void produceProblems(Question question){
        System.out.println(this.courseName+"有问题更新啦"+question.getUserName()+"提出了"+question.getQuestionContent());
        this.setChanged();
        this.notifyObservers(question);

    }


}
