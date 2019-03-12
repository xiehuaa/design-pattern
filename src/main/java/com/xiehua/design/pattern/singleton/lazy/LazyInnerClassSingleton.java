package com.xiehua.design.pattern.singleton.lazy;

/**
 * 内部类实现的单例模式
 * 性能最有的一种写法
 *
 * @author xiehua
 * @date 2019/03/12
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        // 构造方法抛出异常，防止通过反射进行创建对象
        if (LazyHolder.LAZY_INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY_INNER_CLASS_SINGLETON;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }
}
