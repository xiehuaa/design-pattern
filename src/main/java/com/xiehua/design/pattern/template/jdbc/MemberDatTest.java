package com.xiehua.design.pattern.template.jdbc;

import java.util.List;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/19
 */
public class MemberDatTest {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> list = memberDao.selectAll();
        System.out.println(list);
    }
}
