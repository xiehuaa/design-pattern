package com.xiehua.design.pattern.singleton.hungry;

/**
 * 饿汉式单例模式
 * <p>
 * 缺点：浪费内存空间
 *
 * @author xiehua
 * @date 2019/03/11
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
