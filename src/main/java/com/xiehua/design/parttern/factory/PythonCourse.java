package com.xiehua.design.parttern.factory;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/08
 */
public class PythonCourse implements Course {
    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
