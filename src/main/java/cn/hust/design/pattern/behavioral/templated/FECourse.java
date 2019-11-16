package cn.hust.design.pattern.behavioral.templated;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 18:17
 **/
public class FECourse extends Acourse {

    private boolean needMakeVideo = false;

    public FECourse(boolean needMakeVideo) {
        this.needMakeVideo = needMakeVideo;
    }

    @Override
    boolean needMakeVideo() {
        return needMakeVideo;
    }

    @Override
    void packageCourse() {
        System.out.println("打包前端课程");
    }
}
