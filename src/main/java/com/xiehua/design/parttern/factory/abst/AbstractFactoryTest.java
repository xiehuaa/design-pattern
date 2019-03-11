package com.xiehua.design.parttern.factory.abst;

import com.xiehua.design.parttern.factory.Course;

/**
 * 抽象工厂不符合开闭原则  当需要增加一种产品时需要修改源码
 * 扩展性非常强
 * <p>
 * 客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
 * <p>
 * 强调一系列相关的产品对象（属于同一产品组）一起使用创建对象需要大量重复代码
 * <p>
 * 提供一个产品类的库，所有的产品以相同的接口出现，从而使客户端不依赖于具体实现
 * <p>
 * <p>
 * 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
 * 增加了系统的抽象性和理解难度
 *
 * @author xiehua
 * @date 2019/03/11
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Course course = courseFactory.createCourse();
        Note note = courseFactory.createNote();
        Video video = courseFactory.createVideo();

        course.record();
    }
}
