package com.xiehua.design.pattern.singleton.reflect;

import com.xiehua.design.pattern.singleton.hungry.HungrySingleton;

import java.lang.reflect.Constructor;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/20
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class<HungrySingleton> singletonClass = HungrySingleton.class;
        Constructor<HungrySingleton> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton hungrySingleton = constructor.newInstance();
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(hungrySingleton);
        System.out.println(instance);
    }
}
