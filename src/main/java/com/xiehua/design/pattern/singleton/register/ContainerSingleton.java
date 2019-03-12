package com.xiehua.design.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 对象方便管理
 *
 * @author xiehua
 * @date 2019/03/12
 */
public class ContainerSingleton {
    private ContainerSingleton() {

    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {

        synchronized (ContainerSingleton.class) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }
}
