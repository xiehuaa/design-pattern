package com.xiehua.design.pattern.proxy.dbroute;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/14
 */
public class OrderDao {
    public int insert(Order order) {
        System.out.println("新建order成功");
        return 1;
    }
}
