package com.xiehua.design.pattern.singleton.threadlocal;

/**
 * 在同一个线程中是单例
 * <p>
 * 伪线程安全
 *
 * @author xiehua
 * @date 2019/03/12
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {

    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
