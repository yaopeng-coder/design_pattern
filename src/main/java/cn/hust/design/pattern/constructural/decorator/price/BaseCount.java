package cn.hust.design.pattern.constructural.decorator.price;

import java.math.BigDecimal;

/**
 * 支付基本类
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-12-04 14:18
 **/
public class BaseCount implements IBaseCount{

	public BigDecimal countPayMoney(OrderDetail orderDetail) {
		orderDetail.setPayMoney(orderDetail.getProduct().getPrice());
		System.out.println("商品原单价金额为：" +  orderDetail.getPayMoney());
		
		return orderDetail.getPayMoney();
	}

}
