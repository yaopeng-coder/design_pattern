package cn.hust.design.pattern.constructural.decorator;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 18:48
 **/
public class EggCakeDecorator extends CakeDecorator {

    public EggCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public String cook() {
        return super.cook()+"加一个鸡蛋";
    }

    @Override
    public Integer pay() {
        return super.pay()+2;
    }
}
