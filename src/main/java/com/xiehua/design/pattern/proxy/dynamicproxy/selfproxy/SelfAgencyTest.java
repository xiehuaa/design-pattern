package com.xiehua.design.pattern.proxy.dynamicproxy.selfproxy;

import com.xiehua.design.pattern.proxy.JobSeeker;
import com.xiehua.design.pattern.proxy.Student;
import com.xiehua.design.pattern.proxy.dynamicproxy.jdkproxy.Agency;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class SelfAgencyTest {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.setName("李四");
            JobSeeker jobSeeker = (JobSeeker) new SelfAgency().getInstance(student);
            jobSeeker.findJob();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
