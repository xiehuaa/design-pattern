package com.xiehua.design.pattern.factory.method;

import com.xiehua.design.pattern.factory.Course;

/**
 * 工厂方法模式(Factory Method Pattern)是指定义一个创建对象的接口，
 * 让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到
 * 子类中进行。
 * <p>
 * 属于创建型设计模式
 * <p>
 * 使用场景
 * 1、创建对象需要大量重复的代码。
 * 2、客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
 * 3、一个类通过其子类来指定创建哪个对象。
 * <p>
 * 好处：
 * 1、用户只需关心所需产品对应的工厂，无须关心创建细节。
 * 2、加入新产品符合开闭原则，提高了系统的可扩展性。
 * 坏处：
 * 1、类的个数容易过多，增加了代码结构的复杂性。
 * 2、增加了系统抽象性和理解难度。
 *
 * @author xiehua
 * @date 2019/03/08
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Course course = courseFactory.create();
        course.record();
    }
}
