package com.xiehua.design.pattern.template.course;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/19
 */
public abstract class NetworkCourse {
    protected final void createCourse() {
        this.postPreResource();
        this.createPPT();
        this.liveVideo();
        this.postNote();
        this.postSource();
        if (this.needHomeWork()) {
            this.checkHomeWork();
        }
    }

    abstract void checkHomeWork();

    protected boolean needHomeWork(){
        return false;
    }

    final void postSource() {
        System.out.println("提交源码");
    }

    final void postNote() {
        System.out.println("提交笔记");
    }

    final void liveVideo() {
        System.out.println("直播");
    }

    final void createPPT() {
        System.out.println("制作ppt");
    }

    final void postPreResource() {
        System.out.println("分发预习资料");
    }
}
