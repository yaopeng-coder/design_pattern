package cn.hust.design.pattern.behavioral.iterator;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 12:15
 **/
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();

}
