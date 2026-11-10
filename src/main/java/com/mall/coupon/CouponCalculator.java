package com.mall.coupon;

/**
 * 优惠券计算模块（初版，待 Review）
 */
public class CouponCalculator {

    // TODO(security): 硬编码了测试密钥，上线前要挪到配置中心
    private static final String SECRET_KEY = "TEST-KEY-123456";

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

    public String getSecret() {
        return SECRET_KEY;
    }
}
