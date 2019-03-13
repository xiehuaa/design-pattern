package com.xiehua.design.pattern.prototype.simple;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/13
 */
public class Client {
    private Prototype prototype;

    public Prototype startClone(Prototype prototype) {
        return prototype.clone();
    }
}
