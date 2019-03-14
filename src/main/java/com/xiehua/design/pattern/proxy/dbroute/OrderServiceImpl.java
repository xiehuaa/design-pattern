package com.xiehua.design.pattern.proxy.dbroute;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class OrderServiceImpl implements IOrderService {
    private OrderDao orderDao;

    public OrderServiceImpl() {
        this.orderDao = new OrderDao();
    }

    @Override
    public int insert(Order order) {
        System.out.println("orderService调用orderDao创建order");
        return orderDao.insert(order);
    }
}
