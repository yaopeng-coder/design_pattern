package cn.hust.design.pattern.behavioral.observer;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:30
 **/
public class Test {


    public static void main(String[] args){

        Course course = new Course("设计模式");
        course.addObserver(new Teacher("刘老师"));
        course.produceProblems(new Question("小红","设计模式和设计原则的关系"));
    }
}
