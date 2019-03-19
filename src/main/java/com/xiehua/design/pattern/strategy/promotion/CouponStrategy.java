package com.xiehua.design.pattern.strategy.promotion;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/18
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券");
    }
}
