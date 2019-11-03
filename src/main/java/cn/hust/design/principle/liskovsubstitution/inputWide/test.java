package cn.hust.design.principle.liskovsubstitution.inputWide;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 21:26
 **/
public class test {


    public static void main(String[] args){
            Child child = new Child();
            Map map = new HashMap();
            child.get(map);
    }
}
