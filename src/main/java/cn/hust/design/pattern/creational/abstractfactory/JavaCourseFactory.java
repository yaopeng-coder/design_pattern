package cn.hust.design.pattern.creational.abstractfactory;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-05 20:42
 **/
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
