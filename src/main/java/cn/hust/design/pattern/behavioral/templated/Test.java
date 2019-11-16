package cn.hust.design.pattern.behavioral.templated;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 18:18
 **/
public class Test {

    public static void main(String[] args){

        Acourse javaCouse = new JavaCourse();
        javaCouse.makeCourse();

        Acourse feCourse = new FECourse(true);
        feCourse.makeCourse();
    }
}
