package com.xiehua.design.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 线程不安全
 *
 * @author xiehua
 * @date 2019/03/11
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
