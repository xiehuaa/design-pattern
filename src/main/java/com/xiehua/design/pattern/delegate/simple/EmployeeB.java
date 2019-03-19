package com.xiehua.design.pattern.delegate.simple;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/18
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("员工B");
    }
}
