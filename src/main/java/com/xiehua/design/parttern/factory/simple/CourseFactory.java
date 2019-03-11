package com.xiehua.design.parttern.factory.simple;

import com.xiehua.design.parttern.factory.Course;
import com.xiehua.design.parttern.factory.JavaCourse;

/**
 * @author xiehua
 * @date 2019/03/08
 */
public class CourseFactory {
    public Course createCourse(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else {
            return null;
        }
    }

    public Course course(Class clazz) {
        try {
            if (clazz != null) {
                return (Course) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
