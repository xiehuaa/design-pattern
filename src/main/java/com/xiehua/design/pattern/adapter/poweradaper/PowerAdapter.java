package com.xiehua.design.pattern.adapter.poweradaper;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/20
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outPutAC220();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用powerAdapter输入电流为：" + adapterInput);
        System.out.println("使用powerAdapter输出电流为：" + adapterOutput);

        return adapterOutput;
    }
}
