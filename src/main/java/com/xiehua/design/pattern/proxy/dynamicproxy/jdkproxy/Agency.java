package com.xiehua.design.pattern.proxy.dynamicproxy.jdkproxy;

import com.xiehua.design.pattern.proxy.JobSeeker;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class Agency implements InvocationHandler {
    private JobSeeker target;

    public Object getInstance(JobSeeker jobSeeker) {
        target = jobSeeker;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object object = method.invoke(this.target, args);
        this.after();
        return object;
    }

    private void before() {
        System.out.println("动态代理帮助学生找工作");
    }
    private void after() {
        System.out.println("动态代理帮助学生找到合适的工作");
    }
}
