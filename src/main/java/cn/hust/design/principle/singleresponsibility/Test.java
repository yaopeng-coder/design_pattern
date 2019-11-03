package cn.hust.design.principle.singleresponsibility;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-03 17:01
 **/
public class Test {

    public static void main(String[] args){
           /* Bird bird = new Bird();
            bird.fly("大雁");
            bird.fly("鸵鸟");*/

           WalkBird walkBird = new WalkBird();
           walkBird.walk("鸵鸟");
           FlyBird flyBird = new FlyBird();
           flyBird.fly("大雁");

    }
}
