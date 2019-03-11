package com.xiehua.design.parttern.factory.method;

import com.xiehua.design.parttern.factory.Course;
import com.xiehua.design.parttern.factory.PythonCourse;

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
