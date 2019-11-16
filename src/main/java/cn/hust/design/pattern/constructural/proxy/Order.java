package cn.hust.design.pattern.constructural.proxy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 14:26
 **/
public class Order {

    private String orderInfo;

    private Integer userId;

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
