package cn.hust.design.pattern.behavioral.strategy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 14:57
 **/
public class EmptyPromotionStrategy implements PromotionStrategy{


    @Override
    public void doPromotion() {
        System.out.println("这是一个空策略");
    }
}
