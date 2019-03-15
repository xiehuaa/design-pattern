package com.xiehua.design.pattern.proxy.dynamicproxy.cglibproxy;

import com.xiehua.design.pattern.proxy.Student;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/15
 */
public class AgencyTest {
    public static void main(String[] args) {
        Student instance = (Student) new Agency().getInstance(Student.class);
        instance.setName("王五");
        instance.findJob();
    }
}
