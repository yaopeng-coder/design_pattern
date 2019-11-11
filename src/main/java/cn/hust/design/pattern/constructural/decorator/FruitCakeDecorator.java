package cn.hust.design.pattern.constructural.decorator;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 18:56
 **/
public class FruitCakeDecorator extends CakeDecorator {

    public FruitCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String cook() {
        return super.cook()+"加一块水果";
    }

    @Override
    public Integer pay() {
        return super.pay()+5;
    }
}
