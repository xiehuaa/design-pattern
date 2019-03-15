package com.xiehua.design.pattern.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/15
 */
public class Agency implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        after();
        return invokeSuper;
    }

    private void before() {
        System.out.println("cglib实现动态代理帮助学生找工作");
    }
    private void after() {
        System.out.println("cglib实现动态代理帮助学生找到合适的工作");
    }
}
