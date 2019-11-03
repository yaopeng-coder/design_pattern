package cn.hust.design.principle.singleresponsibility;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 17:00
 **/
public class Bird {

    public void fly(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }
        System.out.println(birdName+"用翅膀飞");
    }
}
