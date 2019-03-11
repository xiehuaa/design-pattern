package com.xiehua.design.parttern.factory.abst;

import com.xiehua.design.parttern.factory.Course;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/11
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Course createCourse() {
        return null;
    }

    @Override
    public Note createNote() {
        return null;
    }

    @Override
    public Video createVideo() {
        return null;
    }
}
