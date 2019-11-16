package cn.hust.design.pattern.constructural.proxy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 14:29
 **/
public class IOrderServiceImpl implements IOrderService {

    private IOrderDao orderDao;

    @Override
    public int insert(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("service层调用dao层");
        return orderDao.insert(order);
    }
}
