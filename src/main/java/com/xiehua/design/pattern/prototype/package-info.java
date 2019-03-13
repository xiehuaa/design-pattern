/**
 * Created by xiehua on 2019/3/13.
 * <p>
 * 原型模式（Prototype Pattern）是指原型实例指定创建对象的种类，
 * 并且通过拷贝这些原型创建新的对象
 * <p>
 * 调用者不需要直到任何创建细节，不调用构造函数
 * <p>
 * 属于创建型模式
 * <p>
 * 适用场景
 * 1、类初始化消耗资源较多。
 * 2、new产生的一个对象需要非常繁琐的过程（数据准备、访问权限）
 * 3、构造函数比较复杂
 * 4、循环体中生产大量对象
 */
package com.xiehua.design.pattern.prototype;