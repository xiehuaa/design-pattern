package com.xiehua.design.pattern.proxy.staticproxy;

import com.xiehua.design.pattern.proxy.dbroute.IOrderService;
import com.xiehua.design.pattern.proxy.dbroute.Order;
import com.xiehua.design.pattern.proxy.dbroute.OrderServiceImpl;
import com.xiehua.design.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.util.Date;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class OrderServiceStaticProxyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreatTime(new Date());

        IOrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());
        orderService.insert(order);
    }
}
