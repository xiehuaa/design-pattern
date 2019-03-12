package com.xiehua.design.pattern.singleton.register;

/**
 * 枚举式单例
 *
 * @author xiehua
 * @date 2019/03/12
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
