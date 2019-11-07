package cn.hust.design.pattern.creational.singleton;

/**
 * 静态内部类解决重排序问题
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-06 21:59
 **/
public class StaticInnerLazySingleton {

//　             类初始化五种情况，并且类在初始化时有一个初始化锁，其他线程进不去，所以线程安全
    //为什么类初始化加锁，对象初始化不加锁？大概是类初始化要做的工作很多，
    // 而且只初始化一次，但对象初始化次数会很多，如果每次对象初始化都加锁，消耗会很大

//               A类型实例被创建（new方法）
//              A类声明的静态方法被调用
//              A类声明的静态成员被赋值
//              A类声明的静态成员被使用，并且该成员不是常量成员
//              A类如果是顶级类，并且在类中有嵌套的断言语句

    private static class InnerClass{
        private static StaticInnerLazySingleton staticInnerLazySingleton = new StaticInnerLazySingleton();
    }

    //一定要写private，否则构造器可以被外部使用
    private StaticInnerLazySingleton(){
        if(InnerClass.staticInnerLazySingleton != null){
            throw  new RuntimeException("单例模式");
        }
    }

    private StaticInnerLazySingleton getInstance(){
            return InnerClass.staticInnerLazySingleton;
    }
}
