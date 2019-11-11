package cn.hust.design.pattern.constructural.adapter.objectadapter;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 19:56
 **/
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
            adaptee.adapteeRequest();
    }
}
