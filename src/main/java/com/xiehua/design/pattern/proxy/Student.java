package com.xiehua.design.pattern.proxy;

import com.xiehua.design.pattern.proxy.JobSeeker;
import lombok.Getter;
import lombok.Setter;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
@Setter
@Getter
public class Student implements JobSeeker {
    private String name;

    public Student() {
    }
    @Override
    public void findJob() {
        System.out.println("学生" + this.name +"找工作");
    }
}
