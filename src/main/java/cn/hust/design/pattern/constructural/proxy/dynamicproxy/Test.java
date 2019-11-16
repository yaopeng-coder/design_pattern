package cn.hust.design.pattern.constructural.proxy.dynamicproxy;

import cn.hust.design.pattern.constructural.proxy.IOrderService;
import cn.hust.design.pattern.constructural.proxy.IOrderServiceImpl;
import cn.hust.design.pattern.constructural.proxy.Order;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 15:55
 **/
public class Test {

    public static void main(String[] args){

        //jdk动态代理实现
        Order order = new Order();
        order.setUserId(1);
        IOrderService proxyorder1 =(IOrderService) new JDKproxy(new IOrderServiceImpl()).getProxyObject();
        proxyorder1.insert(order);

    }
}
