package com.xiehua.design.pattern.proxy.staticproxy;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        JobSeeker jobSeeker = new Student("张三");
        Agency agency = new Agency(jobSeeker);
        agency.findWork();
    }
}
