package com.xiehua.design.pattern.proxy.staticproxy;

import com.xiehua.design.pattern.proxy.dbroute.IOrderService;
import com.xiehua.design.pattern.proxy.dbroute.Order;
import com.xiehua.design.pattern.proxy.dbroute.OrderServiceImpl;
import com.xiehua.design.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.util.Date;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/15
 */
public class OrderServiceDynamicProxyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date());
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
        int insert = orderService.insert(order);
        System.out.println(insert);
    }
}
