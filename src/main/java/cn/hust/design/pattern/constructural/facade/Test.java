package cn.hust.design.pattern.constructural.facade;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 21:37
 **/
public class Test {

    public static void main(String[] args){

        GiftExchangeService service = new GiftExchangeService();
        service.giftExchange(new PointsGift("手链"));

    }
}
