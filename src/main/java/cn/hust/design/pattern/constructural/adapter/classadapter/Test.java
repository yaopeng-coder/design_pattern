package cn.hust.design.pattern.constructural.adapter.classadapter;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 19:51
 **/
public class Test {



    public static void main(String[] args){
        Target target = new BigTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
