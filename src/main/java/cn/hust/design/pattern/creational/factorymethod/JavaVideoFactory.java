package cn.hust.design.pattern.creational.factorymethod;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-04 21:24
 **/
public class JavaVideoFactory  extends VideoFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
