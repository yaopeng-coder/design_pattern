package cn.hust.design.pattern.constructural.decorator;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 18:43
 **/
public class PinCake implements Cake {

    @Override
    public String cook() {
      return "做一个蛋糕";
    }

    @Override
    public Integer pay() {

       return 5;
    }
}
