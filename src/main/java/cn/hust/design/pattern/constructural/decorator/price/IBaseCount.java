package cn.hust.design.pattern.constructural.decorator.price;

import java.math.BigDecimal;

/**
 * 计算支付金额接口类
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-12-04 14:18
 **/
public interface IBaseCount {
	
	BigDecimal countPayMoney(OrderDetail orderDetail);

}
