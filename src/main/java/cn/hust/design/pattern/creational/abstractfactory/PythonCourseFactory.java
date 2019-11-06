package cn.hust.design.pattern.creational.abstractfactory;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-05 20:43
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
