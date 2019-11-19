package cn.hust.design.pattern.behavioral.observer;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:17
 **/
public class Question {


    private String userName;
    private String questionContent;

    public Question(String userName, String questionContent) {
        this.userName = userName;
        this.questionContent = questionContent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
