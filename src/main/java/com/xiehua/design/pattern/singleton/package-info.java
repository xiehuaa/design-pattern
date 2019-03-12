/**
 * 单例模式（Singleton Pattern）是指通过一定手段保证一个类在任何情况下都绝对
 * 只有一个实例，并提供一个全局访问点
 * <p>
 * ServletContext ServletConfig ApplicationContext DBPool
 * <p>
 * 所有构造方法私有化
 * <p>
 * 属于创建型模式
 * <p>
 * 1、饿汉式
 * 2、懒汉式
 * 3、注册式单例
 * 4、ThreadLocal单例
 */
package com.xiehua.design.pattern.singleton;