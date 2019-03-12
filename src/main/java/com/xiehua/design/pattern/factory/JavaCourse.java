package com.xiehua.design.pattern.factory;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/08
 */
public class JavaCourse implements Course {
    @Override
    public void record() {
        System.out.println("录制java课程");
    }
}
