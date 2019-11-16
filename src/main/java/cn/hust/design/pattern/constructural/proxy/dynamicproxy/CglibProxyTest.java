package cn.hust.design.pattern.constructural.proxy.dynamicproxy;

import cn.hust.design.pattern.constructural.proxy.IOrderService;
import cn.hust.design.pattern.constructural.proxy.IOrderServiceImpl;
import cn.hust.design.pattern.constructural.proxy.Order;
import cn.hust.design.pattern.constructural.proxy.db.DataSourceContextHolder;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 15:59
 **/
public class CglibProxyTest {




    public  static void main(String[] args){



        IOrderService orderService = new IOrderServiceImpl();



        IOrderService proxy  = (IOrderService) Enhancer.create(orderService.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                beforeMethod(objects[0]);

                //匿名内部类访问局部变量要用final修饰，实际上为了保护数据的一致性
                Object result  = method.invoke(orderService, objects);

                afterMethod();
                return result;
            }
        });
        Order order = new Order();
        order.setUserId(2);
        proxy.insert(order);

    }


    public static void beforeMethod(Object object){
        System.out.println("代理方法之前执行");
        int userId = 0;
        if(object instanceof Order){
            Order order = (Order)object;
            userId = order.getUserId();

        }
        int routerType = userId % 2;

        //todo 获取数据源
        DataSourceContextHolder.setContextHolder("db" + String.valueOf(routerType));
        System.out.println("静态代理分配到db"+routerType+"处理数据");

    }

    public static void afterMethod(){
        System.out.println("代理方法之后执行");

    }

}
