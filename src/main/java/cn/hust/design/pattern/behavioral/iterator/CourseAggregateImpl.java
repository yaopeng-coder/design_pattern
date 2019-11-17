package cn.hust.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 12:15
 **/
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
