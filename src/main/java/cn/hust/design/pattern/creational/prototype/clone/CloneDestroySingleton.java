package cn.hust.design.pattern.creational.prototype.clone;

import cn.hust.design.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 20:32
 **/
public class CloneDestroySingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //反射会破坏单例模式演示
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Class<HungrySingleton> singleClass = HungrySingleton.class;
        Method method = singleClass.getDeclaredMethod("clone");
        method.setAccessible(true);
        //方法反射调用
        HungrySingleton clone = (HungrySingleton)method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(clone);



    }
}
