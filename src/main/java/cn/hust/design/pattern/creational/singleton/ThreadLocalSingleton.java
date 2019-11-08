package cn.hust.design.pattern.creational.singleton;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-08 21:39
 **/
public class ThreadLocalSingleton {

    private static  final ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){

    }

    public static ThreadLocalSingleton getSingleton(){
        return threadLocalSingletonThreadLocal.get();
    }

    public static void main(String[] args){
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        System.out.println("ssssssss");
    }
}

