package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("math")
@Tag("wc459")
@DisplayName("LeetCode: 3622. Check Divisibility by Digit Sum and Product")
class CheckDivisibilityByDigitSumAndProductTest {
    private CheckDivisibilityByDigitSumAndProduct checkDivisibilityByDigitSumAndProduct;

    @BeforeEach
    void setup() {
        checkDivisibilityByDigitSumAndProduct = new CheckDivisibilityByDigitSumAndProduct();
    }

    private void test(boolean output, int n) {
        Assertions.assertEquals(output, checkDivisibilityByDigitSumAndProduct.checkDivisibility(n));
    }

    @Test
    void test0() {
        test(true, 99);
    }
}
