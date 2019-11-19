package cn.hust.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:33
 **/
public class GuavaTeacher {

    private String teacherName;



    public GuavaTeacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }



    @Subscribe
    public void onEventww(GuavaCourse course){

        System.out.println(this.teacherName+"收到了"+course.getCourseName()+course.getQuestion().getUserName()+course.getQuestion().getQuestionContent());
    }
}
