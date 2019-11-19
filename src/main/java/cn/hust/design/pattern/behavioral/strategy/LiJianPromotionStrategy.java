package cn.hust.design.pattern.behavioral.strategy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 14:46
 **/
public class LiJianPromotionStrategy implements PromotionStrategy {


    @Override
    public void doPromotion() {
        System.out.println("立减策略，直接减30");
    }
}
