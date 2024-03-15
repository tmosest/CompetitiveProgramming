package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wcx")
@DisplayName("LeetCode: 238. Product of Array Except Self")
class ProductOfArrayExceptSelfTest {
    private ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @BeforeEach
    void setup() {
        productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    }

    private void test(int[] output, int[] nums) {
        Assertions.assertArrayEquals(output, productOfArrayExceptSelf.productExceptSelf(nums));
    }

    @Test
    void test0() {
        test(new int[] { 24, 12, 8, 6 }, new int[] { 1, 2, 3, 4 });
    }

    @Test
    void test1() {
        test(new int[] { 0, 0, 9, 0, 0 }, new int[] { -1, 1, 0, -3, 3 });
    }
}
