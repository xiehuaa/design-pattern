package com.xiehua.design.pattern.proxy.dynamicproxy.selfproxy;

import com.xiehua.design.pattern.proxy.JobSeeker;

import java.lang.reflect.Method;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class SelfAgency implements SelfInvocationHandler {
    private JobSeeker target;

    public Object getInstance(JobSeeker jobSeeker) {
        target = jobSeeker;
        Class<?> clazz = target.getClass();
        return SelfProxy.newProxyInstance(new SelfClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object object = method.invoke(this.target, args);
        this.after();
        return object;
    }

    private void before() {
        System.out.println("自定义动态代理帮助学生找工作");
    }

    private void after() {
        System.out.println("自定义动态代理帮助学生找到合适的工作");
    }
}
