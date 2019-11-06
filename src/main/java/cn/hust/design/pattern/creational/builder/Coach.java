package cn.hust.design.pattern.creational.builder;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-05 21:37
 **/
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course build(String courseName, String coursePrice, String courseArticle, String courseQA){
        courseBuilder.setCourseName(courseName);
        courseBuilder.setCoursePrice(coursePrice);
        courseBuilder.setCourseArticle(courseArticle);
        courseBuilder.setCourseQA(courseQA);
        return courseBuilder.build();
    }
}
