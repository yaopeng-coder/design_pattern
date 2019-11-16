package cn.hust.design.pattern.behavioral.templated;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 18:16
 **/
public class JavaCourse extends Acourse {

    @Override
    boolean needMakeVideo() {
        return true;
    }

    @Override
    void packageCourse() {
        System.out.println("打包java课程");
    }
}
