package com.xiehua.design.pattern.delegate.simple;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/18
 */
public class DelegateTest {
    public static void main(String[] args) {
        Leader leader = new Leader();
        Boss boss = new Boss();
        boss.command("employeeA", leader);
        boss.command("employeeB", leader);
    }
}
