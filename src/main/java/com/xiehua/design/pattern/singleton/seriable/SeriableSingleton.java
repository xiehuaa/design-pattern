package com.xiehua.design.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/12
 */
public class SeriableSingleton implements Serializable {
    private SeriableSingleton() {

    }

    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 避免通过序列化的形式来破坏单例
     * 覆盖了反序列化出来的对象
     * 还是创建了两次，发生在JVM层面，相对来说比较安全
     * 之前发序列化出来的对象会被GC回收
     *
     * @return
     */
    private Object readResolve() {
        return INSTANCE;
    }

}
