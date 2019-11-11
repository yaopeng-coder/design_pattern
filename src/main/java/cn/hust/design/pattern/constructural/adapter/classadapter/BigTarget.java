package cn.hust.design.pattern.constructural.adapter.classadapter;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 19:49
 **/
public class BigTarget implements Target {

    @Override
    public void request() {
        System.out.println("我配不上原来的，需要帮我适配一下");
    }
}
