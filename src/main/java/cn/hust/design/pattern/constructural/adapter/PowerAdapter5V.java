package cn.hust.design.pattern.constructural.adapter;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-11 20:00
 **/
public class PowerAdapter5V implements DC5 {

    private AC220 ac220 = new AC220();

    @Override
    public Integer output5V() {
        Integer outputDC5V = ac220.outputDC5V();
        Integer result = outputDC5V /4 ;
        System.out.println("我现在被转化成了"+result);
        return result;
    }
}
