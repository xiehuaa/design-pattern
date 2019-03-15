/**
 * 动态代理
 * jdkproxy包中是使用jdk自带的动态代理
 * selfproxy包中是自己实现的动态代理
 *
 * JDK动态代理实现原理：
 * 1、通过被代理类的引用，获取它的所有的接口（通过反射）
 * 2、JDK Proxy类重新生成一个新的类，实现了被代理类所有接口的方法
 * 3、动态生成Java代码，把增强的逻辑加入到新生成的代码中
 * 4、编译新生成的Java代码
 * 5、加载并重新运行新的class,
 */
package com.xiehua.design.pattern.proxy.dynamicproxy;