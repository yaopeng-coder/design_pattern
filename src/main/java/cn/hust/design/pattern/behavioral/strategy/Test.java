package cn.hust.design.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 14:50
 **/
public class Test {

    public static void main(String[] args){

        //第一种实现
//        PromotionStrategy promotionStrategy = new ManJianPromotionStrategy();
//        PromotionActivity promotionActivity = new PromotionActivity(promotionStrategy);
//        promotionActivity.executePromotionActivity();
//
//        PromotionStrategy promotionStrategy1 = new LiJianPromotionStrategy();
//        PromotionActivity promotionActivity1 = new PromotionActivity(promotionStrategy1);
//        promotionActivity1.executePromotionActivity();

        //第二种实现，大量的if else,这就将主题选择交给了客户端，客户端必须非常清楚有哪些策略实现类，可以用简单工厂解决这个问题
        PromotionActivity promotionActivity = null;
        String strategyKey = "MANJIAN";
        if(StringUtils.equals(strategyKey,"MANJIAN")){
             promotionActivity = new PromotionActivity( new ManJianPromotionStrategy());
        }else if(StringUtils.equals(strategyKey,"FANXIAN")){
             promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        }else if(StringUtils.equals(strategyKey,"LIJIAN")){
            promotionActivity = new PromotionActivity( new LiJianPromotionStrategy());
        }else {
             promotionActivity = new PromotionActivity(new EmptyPromotionStrategy());
        }

        //
        promotionActivity.executePromotionActivity();

        //用工厂模式+类似容器单例模式解决策略模式存在的if else,将选择交给工厂
//        String promotionKey = "LIJIANkkk";
//        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
//        //策略模式侧重行为，不需要具体对象
//        promotionActivity.executePromotionActivity();


    }
}
