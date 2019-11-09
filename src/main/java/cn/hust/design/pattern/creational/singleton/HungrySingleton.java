package cn.hust.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-07 20:40
 **/
public class HungrySingleton implements Serializable,Cloneable{

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        //因为这两种模式下单例都是static 你获取它的值的话都会先进行类初始化，
           if(hungrySingleton != null){
                throw  new RuntimeException("单例模式");
           }

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
