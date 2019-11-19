package cn.hust.design.pattern.behavioral.strategy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 14:49
 **/
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionActivity(){
        promotionStrategy.doPromotion();
    }
}
