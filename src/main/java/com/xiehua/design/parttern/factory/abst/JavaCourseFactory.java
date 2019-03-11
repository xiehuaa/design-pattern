package com.xiehua.design.parttern.factory.abst;

import com.xiehua.design.parttern.factory.Course;
import com.xiehua.design.parttern.factory.JavaCourse;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/11
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Course createCourse() {
        return new JavaCourse();
    }

    @Override
    public Note createNote() {
        return new JavaNote();
    }

    @Override
    public Video createVideo() {
        return new JavaVideo();
    }
}
