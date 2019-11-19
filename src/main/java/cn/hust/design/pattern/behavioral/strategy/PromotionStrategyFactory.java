package cn.hust.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-17 15:00
 **/
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> promotionStrategyMap = new HashMap<>();

    static {
        promotionStrategyMap.put(StrategyKey.MANJIAN,new ManJianPromotionStrategy());
        promotionStrategyMap.put(StrategyKey.LIJIAN,new LiJianPromotionStrategy());
        promotionStrategyMap.put(StrategyKey.FAXIAN,new FanXianPromotionStrategy());
        promotionStrategyMap.put(StrategyKey.EMPTY,new EmptyPromotionStrategy());

    }

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){

        PromotionStrategy promotionStrategy = null;
        if(promotionStrategyMap.containsKey(promotionKey)){
            promotionStrategy = promotionStrategyMap.get(promotionKey);
        }else{
            promotionStrategy = promotionStrategyMap.get(StrategyKey.EMPTY);
        }
        return promotionStrategy;
    }

    interface StrategyKey{
        String MANJIAN = "MANJIAN";
        String LIJIAN = "LIJIAN";
        String FAXIAN = "FAXIAN";
        String EMPTY = "EMPTY";

    }
}
