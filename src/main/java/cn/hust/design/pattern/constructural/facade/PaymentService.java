package cn.hust.design.pattern.constructural.facade;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 21:32
 **/
public class PaymentService {

    public boolean payment(PointsGift gift){
        System.out.println(gift.getName()+"已经扣除了积分");
        return true;
    }
}
