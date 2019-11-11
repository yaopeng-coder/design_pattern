package cn.hust.design.pattern.constructural.adapter.classadapter;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 19:50
 **/
public class Adapter extends Adaptee implements Target  {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
