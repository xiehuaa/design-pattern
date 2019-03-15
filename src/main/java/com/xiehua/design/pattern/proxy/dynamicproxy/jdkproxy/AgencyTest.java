package com.xiehua.design.pattern.proxy.dynamicproxy.jdkproxy;

import com.xiehua.design.pattern.proxy.JobSeeker;
import com.xiehua.design.pattern.proxy.Student;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class AgencyTest {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.setName("李四");
            JobSeeker jobSeeker = (JobSeeker) new Agency().getInstance(student);
            jobSeeker.findJob();

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{JobSeeker.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
