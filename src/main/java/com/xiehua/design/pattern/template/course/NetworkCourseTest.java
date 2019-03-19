package com.xiehua.design.pattern.template.course;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/19
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("=========java课程==========");
        NetworkCourse networkCourse = new JavaCourse();
        networkCourse.createCourse();

        System.out.println("=========大数据课程==========");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
