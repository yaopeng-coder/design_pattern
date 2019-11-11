package cn.hust.design.pattern.constructural.decorator;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 18:56
 **/
public class Test {


    public static void main(String[] args){

        Cake cake = new PinCake();
        CakeDecorator cakeDecorator = new EggCakeDecorator(new EggCakeDecorator(new FruitCakeDecorator(cake)));
        System.out.println(cakeDecorator.cook());
        System.out.println(cakeDecorator.pay());

    }
}
