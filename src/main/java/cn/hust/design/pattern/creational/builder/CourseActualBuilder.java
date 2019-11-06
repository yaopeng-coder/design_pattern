package cn.hust.design.pattern.creational.builder;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-05 21:34
 **/
public class CourseActualBuilder implements CourseBuilder{


    private Course course = new Course();




    @Override
    public void setCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void setCoursePrice(String coursePrice) {
        this.course.setCoursePrice(coursePrice);
    }

    @Override
    public void setCourseArticle(String courseArticle) {
            this.course.setCourseArticle(courseArticle);
    }

    @Override
    public void setCourseQA(String courseQA) {
            this.course.setCourseQA(courseQA);
    }

    @Override
    public Course build() {
        return course;
    }
}
