package com.xiehua.design.pattern.proxy.dbroute.proxy;

import com.xiehua.design.pattern.proxy.dbroute.IOrderService;
import com.xiehua.design.pattern.proxy.dbroute.Order;
import com.xiehua.design.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class OrderServiceStaticProxy implements IOrderService {
    private DateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int insert(Order order) {
        Date createTime = order.getCreateTime();
        int year = Integer.valueOf(yearFormat.format(createTime));
        System.out.println("静态代理类自动分配到【DB_" + year + "】数据源处理数据");
        DynamicDataSourceEntity.set(year);
        this.orderService.insert(order);
        DynamicDataSourceEntity.restore();
        return 1;
    }
}
