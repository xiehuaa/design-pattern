package com.xiehua.design.pattern.delegate.simple;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/18
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
