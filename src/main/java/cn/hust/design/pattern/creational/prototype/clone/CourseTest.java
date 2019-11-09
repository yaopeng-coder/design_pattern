package cn.hust.design.pattern.creational.prototype.clone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 20:47
 **/
public class CourseTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<String> stringList = new ArrayList<String>();
        stringList.add("hello");
        stringList.add("xiaoyao");
        List<Date> dateList = new ArrayList<Date>();
        dateList.add(new Date(0l));
        dateList.add(new Date(999999999l));
        Course course = new Course("java",stringList,dateList);
        Course course1 = (Course)course.clone();
        System.out.println(course == course1);
    }
}
