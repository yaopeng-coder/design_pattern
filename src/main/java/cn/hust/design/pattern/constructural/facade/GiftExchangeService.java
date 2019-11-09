package cn.hust.design.pattern.constructural.facade;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-09 21:35
 **/
public class GiftExchangeService {

    private PaymentService paymentService = new PaymentService();
    private QuanlitityService quanlitityService = new QuanlitityService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift gift){
        if(quanlitityService.isAvailable(gift)){
            if(paymentService.payment(gift)){
                String orderNo = shippingService.shipping(gift);
                System.out.println("物流正在派送，订单号为"+orderNo);
            }
        }
    }
}
