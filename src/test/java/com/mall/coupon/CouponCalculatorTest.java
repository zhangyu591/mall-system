package com.mall.coupon;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CouponCalculatorTest {
    private final CouponCalculator calc = new CouponCalculator();

    @Test
    public void belowThreshold_noDiscount() {
        assertEquals(80.0, calc.discount(80.0, 100.0, 20.0), 0.001);
    }

    @Test
    public void atThreshold_discountApplied() {
        assertEquals(80.0, calc.discount(100.0, 100.0, 20.0), 0.001);
    }

    @Test
    public void overDiscount_floorAtZero() {
        assertEquals(0.0, calc.discount(10.0, 10.0, 50.0), 0.001);
    }
}
