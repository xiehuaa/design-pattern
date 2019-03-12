package com.xiehua.design.pattern.singleton.threadlocal;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/12
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        Thread t3 = new Thread(new ExectorThread());

        t1.start();
        t2.start();
        t3.start();
    }
}
