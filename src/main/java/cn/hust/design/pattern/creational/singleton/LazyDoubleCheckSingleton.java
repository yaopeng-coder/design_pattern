package cn.hust.design.pattern.creational.singleton;

/**
 * 懒汉式双重检查
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-06 21:34
 **/
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton  = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstence() {
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    //1.new 操作有三步，首先分配内存
                    //2.初始化这个对象
                    //3.让lazyDoubleCheckSingleton指向这个内存
                    //如果发生重排序，即这个对象未初始化时就给lazyDoubleCheckSingleton指向这个内存，此时会出问题
                    //避免这种现象，方法一是使用volatile禁止重排序
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazyDoubleCheckSingleton;
    }
}
