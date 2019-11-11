package cn.hust.design.pattern.constructural.decorator;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 18:45
 **/
public class CakeDecorator implements Cake {

    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String cook() {
     return  this.cake.cook();
    }

    @Override
    public Integer pay() {
        return this.cake.pay();
    }
}
