package com.xiehua.design.pattern.strategy.promotion;

import org.apache.commons.lang3.StringUtils;

/**
 * This is Description
 *
 * @author xiehua
 * @date 2019/03/18
 */
public class PromotionTest {
    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "CASHBACK";
        promotionActivity = new PromotionActivity(PromotionStrategyFactory.getInstance(promotionKey));
        promotionActivity.execute();
    }
}
