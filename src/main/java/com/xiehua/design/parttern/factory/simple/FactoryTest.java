package com.xiehua.design.parttern.factory.simple;

import com.xiehua.design.parttern.factory.Course;

/**
 * 简单工厂模式    例如：Calendar
 * <p>
 * 客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 * <p>
 * 工厂类的职责相对过重，增加新的产品需要修改工厂的判断逻辑违背开闭原则
 * 不易扩展过于复杂的产品结构
 *
 * @author xiehua
 * @date 2019/03/08
 */
public class FactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        Course course = courseFactory.createCourse("java");
        course.record();
    }
}
