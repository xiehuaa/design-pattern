package com.xiehua.design.pattern.template.course;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/19
 */
public class BigDataCourse extends NetworkCourse {
    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeworkFlag;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据作业");
    }
}
