package cn.hust.design.pattern.constructural.adapter.objectadapter;



/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 19:55
 **/
public class Test {

    public static void main(String[] args){
        Target target = new BigTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
