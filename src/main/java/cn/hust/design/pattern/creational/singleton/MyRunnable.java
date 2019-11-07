package cn.hust.design.pattern.creational.singleton;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-06 21:10
 **/
public class MyRunnable implements Runnable {

    @Override
    public void run() {
      //  LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstence();
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"    "+hungrySingleton);
    }
}
