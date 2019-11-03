package cn.hust.design.principle.liskovsubstitution.inputWide;


import java.util.Map;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 21:24
 **/
public class Base {

    void get(Map map){
        System.out.println("父类方法执行");
    }

}
