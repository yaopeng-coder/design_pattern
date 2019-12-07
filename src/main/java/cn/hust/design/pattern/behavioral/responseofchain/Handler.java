package cn.hust.design.pattern.behavioral.responseofchain;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 17:17
 **/
public abstract class Handler {

    protected String handleName;

    protected Handler handler;

    public Handler(String handleName) {
        this.handleName = handleName;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void deploy(Course course);
}
