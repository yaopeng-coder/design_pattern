package cn.hust.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-19 09:57
 **/
public class Test {

    public static void main(String[] args){

        GuavaQuestion question = new GuavaQuestion("小红同学","设计模式和设计原则的关系");
        GuavaCourse guavaCourse = new GuavaCourse("设计模式",question);
        EventBus eventBus = new EventBus();
        eventBus.register(new GuavaTeacher("刘老师"));
        eventBus.post(guavaCourse);

    }
}
