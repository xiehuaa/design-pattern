package com.xiehua.design.pattern.adapter.poweradaper;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/20
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        int result = dc5.outputDC5V();
        System.out.println(result);
    }
}
