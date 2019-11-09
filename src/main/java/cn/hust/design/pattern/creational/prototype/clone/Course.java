package cn.hust.design.pattern.creational.prototype.clone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 20:45
 **/
public class Course implements Cloneable{

    private String name ;
    private List<String> list1 ;
    private List<Date> list2;

    public Course(String name, List<String> list1, List<Date> list2) {
        this.name = name;
        this.list1 = list1;
        this.list2 = list2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public List<Date> getList2() {
        return list2;
    }

    public void setList2(List<Date> list2) {
        this.list2 = list2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course course = (Course)super.clone();
        course.list1 = new ArrayList<String>(course.list1);
        course.list2 = new ArrayList<Date>(course.list2);
        return course;
    }
}
