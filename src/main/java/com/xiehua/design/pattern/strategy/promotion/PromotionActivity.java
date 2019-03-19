package com.xiehua.design.pattern.strategy.promotion;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/18
 */
public class PromotionActivity {
    PromotionStrategy promotionStrategy;
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        promotionStrategy.doPromotion();
    }
}
