package cn.hust.design.pattern.constructural.proxy;

import cn.hust.design.pattern.constructural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 14:48
 **/
public class Test {

    public static void main(String[] args){

        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy staticProxy = new OrderServiceStaticProxy();
        staticProxy.insert(order);
    }
}
