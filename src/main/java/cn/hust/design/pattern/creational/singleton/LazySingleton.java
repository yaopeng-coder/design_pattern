package cn.hust.design.pattern.creational.singleton;

/**
 * 懒汉式单例模式，延迟加载
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-06 21:07
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public synchronized static LazySingleton getInstance() {
        if(lazySingleton == null){
            lazySingleton =  new LazySingleton();
        }
        return  lazySingleton;
    }
}
