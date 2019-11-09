package cn.hust.design.pattern.constructural.facade;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 21:34
 **/
public class ShippingService {

    public String shipping(PointsGift gift){
        System.out.println(gift.getName()+"生成订单号，准备发货");
        return "666";
    }
}
