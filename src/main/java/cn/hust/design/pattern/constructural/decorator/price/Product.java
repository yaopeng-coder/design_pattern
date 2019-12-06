package cn.hust.design.pattern.constructural.decorator.price;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 商品
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-12-04 14:18
 **/
public class Product {


	private String sku;//商品SKU
	private String name; //商品名称
	private BigDecimal price; //商品单价
	private Map<PromotionType, SupportPromotions> supportPromotions; //支持促销类型
	
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<PromotionType, SupportPromotions> getSupportPromotions() {
		return supportPromotions;
	}
	public void setSupportPromotions(Map<PromotionType, SupportPromotions> supportPromotions) {
		this.supportPromotions = supportPromotions;
	}
}
