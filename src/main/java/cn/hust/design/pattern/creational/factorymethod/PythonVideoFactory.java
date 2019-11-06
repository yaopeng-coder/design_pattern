package cn.hust.design.pattern.creational.factorymethod;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-04 21:26
 **/
public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
