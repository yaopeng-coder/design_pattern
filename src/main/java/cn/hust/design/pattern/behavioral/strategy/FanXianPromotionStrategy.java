package cn.hust.design.pattern.behavioral.strategy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 14:48
 **/
public class FanXianPromotionStrategy implements PromotionStrategy {


    @Override
    public void doPromotion() {
        System.out.println("返现策略，消费即可返现30");
    }
}
