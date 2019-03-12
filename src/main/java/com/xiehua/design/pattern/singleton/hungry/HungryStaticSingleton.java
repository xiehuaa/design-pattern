package com.xiehua.design.pattern.singleton.hungry;

/**
 * 饿汉式单例模式
 *
 * @author xiehua
 * @date 2019/03/11
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
