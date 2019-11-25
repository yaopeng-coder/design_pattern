package cn.hust.design.pattern.behavioral.mediator;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 15:53
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
