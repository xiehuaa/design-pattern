package com.xiehua.design.pattern.proxy.dbroute.db;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class DynamicDataSourceEntity {
    private final static String DEFAULT_SOURCE = null;
    private final static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    private DynamicDataSourceEntity(){

    }

    public static String get() {
        return threadLocal.get();
    }

    public static void set(String source) {
        threadLocal.set(source);
    }

    public static void set(int year) {
        threadLocal.set("DB_" + year);
    }

    public static void restore() {
        threadLocal.set(DEFAULT_SOURCE);
    }
}
