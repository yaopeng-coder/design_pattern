package cn.hust.design.pattern.constructural.adapter;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 20:02
 **/
public class Test {

    public static void main(String[] args){
        DC5 dc5 = new PowerAdapter5V();
        dc5.output5V();
    }

}
