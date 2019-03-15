package com.xiehua.design.pattern.proxy.staticproxy;

import com.xiehua.design.pattern.proxy.JobSeeker;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class Agency implements JobSeeker {
    private JobSeeker jobSeeker;

    public Agency(JobSeeker jobSeeker) {
        this.jobSeeker = jobSeeker;
    }

    @Override
    public void findJob() {
        System.out.println("中介按照学生要求寻找对应工作");
        jobSeeker.findJob();
    }
}
