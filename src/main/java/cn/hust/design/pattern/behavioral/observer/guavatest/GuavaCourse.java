package cn.hust.design.pattern.behavioral.observer.guavatest;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:54
 **/
public class GuavaCourse {

    private String courseName;
    private GuavaQuestion question;

    public GuavaCourse(String courseName,GuavaQuestion question) {
        this.courseName = courseName;
        this.question = question;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public GuavaQuestion getQuestion() {
        return question;
    }

    public void setQuestion(GuavaQuestion question) {
        this.question = question;
    }
}
