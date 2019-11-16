package cn.hust.design.pattern.constructural.proxy.dynamicproxy;

import cn.hust.design.pattern.constructural.proxy.Order;
import cn.hust.design.pattern.constructural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 15:45
 **/
public class JDKproxy implements InvocationHandler{

    private Object targetObject;

    public JDKproxy(Object targetObject) {
        this.targetObject = targetObject;
    }


    public Object getProxyObject(){
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增强方法
        Object object = args[0];
        beforeMethod(object);
        Object invokeResult = method.invoke(targetObject, args);
        afterMethod();
        return invokeResult;

    }



    public void beforeMethod(Object object){
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

    public void afterMethod(){
        System.out.println("代理方法之后执行");

    }
}
