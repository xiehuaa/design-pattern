package com.xiehua.design.pattern.proxy.dbroute.proxy;

import com.xiehua.design.pattern.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/15
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private final DateFormat yearFormat = new SimpleDateFormat("yyyy");

    private Object object;

    public Object getInstance(Object obj) {
        this.object = obj;
        Class<?> clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(this.object, args);
        after();
        return object;
    }

    private void before(Object target) {
        try {
            System.out.println("Proxy before method");
            Date createTime = (Date) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer year = Integer.valueOf(yearFormat.format(createTime));
            System.out.println("动态代理分配到【DB_" + year + "】数据源。");
            DynamicDataSourceEntity.set(year);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void after() {
        System.out.println("Proxy after method");
        DynamicDataSourceEntity.restore();
    }
}
