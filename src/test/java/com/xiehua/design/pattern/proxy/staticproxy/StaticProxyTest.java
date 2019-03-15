package com.xiehua.design.pattern.proxy.staticproxy;

import com.xiehua.design.pattern.proxy.JobSeeker;
import com.xiehua.design.pattern.proxy.Student;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        JobSeeker jobSeeker = new Student();
        Agency agency = new Agency(jobSeeker);
        agency.findJob();
    }
}
