package cn.hust.design.pattern.creational.singleton;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-06 21:09
 **/
public class Test {

    public static void main(String[] args){
             new Thread(new MyRunnable()).start();
             new Thread((new MyRunnable())).start();
             System.out.println("hello");
    }
}
