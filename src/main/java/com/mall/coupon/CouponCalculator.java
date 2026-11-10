package com.mall.coupon;

/**
 * 优惠券计算模块（Review 修复版）
 */
public class CouponCalculator {

    /** 密钥从环境变量读取，不再硬编码到源码 */
    public String getSecret() {
        String key = System.getenv("COUPON_SECRET");
        if (key == null || key.isEmpty()) {
            throw new IllegalStateException("环境变量 COUPON_SECRET 未配置");
        }
        return key;
    }

    /**
     * 满 N 减 M：订单满 threshold 元减 off 元，最低 0 元
     */
    public double discount(double orderAmount, double threshold, double off) {
        if (orderAmount < threshold) {
            return orderAmount;
        }
        double after = orderAmount - off;
        return after < 0 ? 0 : after;
    }
}
