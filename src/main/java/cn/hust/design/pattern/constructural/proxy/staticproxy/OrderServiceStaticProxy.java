package cn.hust.design.pattern.constructural.proxy.staticproxy;

import cn.hust.design.pattern.constructural.proxy.IOrderService;
import cn.hust.design.pattern.constructural.proxy.IOrderServiceImpl;
import cn.hust.design.pattern.constructural.proxy.Order;
import cn.hust.design.pattern.constructural.proxy.db.DataSourceContextHolder;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 14:31
 **/
public class OrderServiceStaticProxy {

    private IOrderService orderService;




    public int insert(Order order){

        beforeMethod(order);
        orderService = new IOrderServiceImpl();
        int result =  orderService.insert(order);
        afterMethod();
        return result;
    }



    public void beforeMethod(Order order){
        System.out.println("代理方法之前执行");
        int userId = order.getUserId();
        int routerType = userId % 2;

        //todo 获取数据源
        DataSourceContextHolder.setContextHolder("db" + String.valueOf(routerType));
        System.out.println("静态代理分配到db"+routerType+"处理数据");

    }

    public void afterMethod(){
        System.out.println("代理方法之后执行");

    }
}
