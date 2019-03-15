package com.xiehua.design.pattern.proxy.dynamicproxy.selfproxy;

import java.lang.reflect.Method;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/15
 */
public interface SelfInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
