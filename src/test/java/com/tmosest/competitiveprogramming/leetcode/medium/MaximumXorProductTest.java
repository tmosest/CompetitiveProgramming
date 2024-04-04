package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc372")
@DisplayName("LeetCode: 2939. Maximum Xor Product")
class MaximumXorProductTest {
    private MaximumXorProduct maximumXorProduct;

    @BeforeEach
    void setup() {
        maximumXorProduct = new MaximumXorProduct();
    }

    private void test(int output, long a, long b, int n) {
        Assertions.assertEquals(output, maximumXorProduct.maximumXorProduct(a, b, n));
    }

    @Test
    void test0() {
        test(98, 12, 5, 4);
    }
}
