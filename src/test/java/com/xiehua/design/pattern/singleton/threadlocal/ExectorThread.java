package com.xiehua.design.pattern.singleton.threadlocal;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/12
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " : " + threadLocalSingleton);
    }
}
