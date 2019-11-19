package cn.hust.design.pattern.behavioral.strategy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 14:47
 **/
public class ManJianPromotionStrategy implements PromotionStrategy {


    @Override
    public void doPromotion() {
        System.out.println("满减策略，满100减50");
    }
}
