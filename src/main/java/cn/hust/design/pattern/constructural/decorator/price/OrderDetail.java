package cn.hust.design.pattern.constructural.decorator.price;

import java.math.BigDecimal;

/**
 * 详细订单
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-12-04 14:18
 **/
public class OrderDetail {
	private int id; //详细订单ID
	private int orderId;//主订单ID
	private Product product; //商品详情
	private BigDecimal payMoney; //支付单价
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public BigDecimal getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(BigDecimal payMoney) {
		this.payMoney = payMoney;
	}
}
