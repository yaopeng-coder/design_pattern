package cn.hust.design.principle.liskovsubstitution.inputWide;

import java.util.HashMap;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 21:25
 **/
public class Child extends Base {

//    @Override
//    void get(HashMap map) {
//        System.out.println("子类入参Hashmap执行");
//    }


//    @Override
//    void get(Map map) {
//        System.out.println("子类入参Hashmap执行");
//    }

    void get(HashMap map){
        System.out.println("子类入参map执行");
    }
}
