package com.xiehua.design.pattern.strategy.promotion;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/18
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
