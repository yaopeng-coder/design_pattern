package cn.hust.design.principle.singleresponsibility;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 17:08
 **/
public interface ICourse {

    void getCourseName();
    void getCoursePrice();

    void refundCourse();
    void studyCourse();
}
