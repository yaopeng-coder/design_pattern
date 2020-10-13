package cn.hust.design.pattern.constructural.decorator.price;

import java.math.BigDecimal;

/**
 * 计算使用优惠券后的金额
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-12-04 14:18
 **/
public class CouponDecorator extends BaseCountDecorator{

	public CouponDecorator(IBaseCount count) {
		super(count);
	}
	
	public BigDecimal countPayMoney(OrderDetail orderDetail) {
		BigDecimal payTotalMoney = new BigDecimal(0);
		payTotalMoney = super.countPayMoney(orderDetail);
		payTotalMoney = countCouponPayMoney(orderDetail);
		return payTotalMoney;
	}
	
	private BigDecimal countCouponPayMoney(OrderDetail orderDetail) {
		
		BigDecimal coupon =  orderDetail.getProduct().getSupportPromotions().get(PromotionType.COUPON).getUserCoupon().getCoupon();
		System.out.println("优惠券金额：" + coupon);
		
		orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(coupon));
		return orderDetail.getPayMoney();
	}
	

}