package cn.hust.design.pattern.creational.builder;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-05 21:33
 **/
public interface CourseBuilder {


    void setCourseName(String courseName);
    void setCoursePrice(String coursePrice);
    void setCourseArticle(String courseArticle);
    void setCourseQA(String courseQA);

    Course build();
 }
