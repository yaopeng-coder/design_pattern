package cn.hust.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-08 21:20
 **/

public class ContainerSingleton {

    //容器单例在多线程中是存在隐患的
    private static Map<String,Object> singletonMap = new HashMap<String, Object>();

    private  ContainerSingleton(){

    }

    public static void putSingleton(String key ,Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getSingleton(String key){
        return singletonMap.get(key);
    }


    public static void main(String[] args){
            new Thread(new MyRunnable()).start();
            new Thread(new MyRunnable()).start();

    }

}
