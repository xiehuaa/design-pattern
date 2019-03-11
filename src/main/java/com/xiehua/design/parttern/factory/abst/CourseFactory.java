package com.xiehua.design.parttern.factory.abst;

import com.xiehua.design.parttern.factory.Course;

/**
 * This is Description
 * 所有的工厂均需要实现该工厂接口
 *
 * @author xiehua
 * @date 2019/03/11
 */
public interface CourseFactory {
    Course createCourse();

    Note createNote();

    Video createVideo();
}
