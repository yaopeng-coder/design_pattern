package cn.hust.design.pattern.constructural.proxy;

/**
 * @program: design_pattern
 * @author: yaopeng
 * @create: 2019-11-16 14:28
 **/
public class OrderDaoImpl implements IOrderDao {


    @Override
    public int insert(Order order) {
        System.out.println("DAO层插入订单数据");
        return 1;
    }
}
