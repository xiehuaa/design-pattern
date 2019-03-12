package com.xiehua.design.pattern.factory.method;

import com.xiehua.design.pattern.factory.Course;
import com.xiehua.design.pattern.factory.PythonCourse;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/08
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Course create() {
        return new PythonCourse();
    }
}
