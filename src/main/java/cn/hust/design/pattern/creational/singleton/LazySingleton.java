package cn.hust.design.pattern.creational.singleton;

/**
 * 懒汉式单例模式，延迟加载
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-06 21:07
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;

    private LazySingleton(){
            //无效
//        if(lazySingleton != null){
//            throw  new RuntimeException("单例模式");
//        }
        if(flag == true){
            flag = false;
        }else{
            throw  new RuntimeException("单例模式禁止反射调用");
        }


    }

    public synchronized static LazySingleton getInstance() {
        if(lazySingleton == null){
            lazySingleton =  new LazySingleton();
        }
        return  lazySingleton;
    }


    public static void main(String[] args){

    }
}
