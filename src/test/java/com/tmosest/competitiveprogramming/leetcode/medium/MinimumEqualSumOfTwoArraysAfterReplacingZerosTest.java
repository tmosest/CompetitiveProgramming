package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc369")
@DisplayName("LeetCode: 2918. Minimum Equal Sum of Two Arrays After Replacing Zeros")
class MinimumEqualSumOfTwoArraysAfterReplacingZerosTest {
    private MinimumEqualSumOfTwoArraysAfterReplacingZeros minimumEqualSumOfTwoArraysAfterReplacingZeros;

    @BeforeEach
    void setup() {
        minimumEqualSumOfTwoArraysAfterReplacingZeros = new MinimumEqualSumOfTwoArraysAfterReplacingZeros();
    }

    private void test(long output, int[] nums1, int[] nums2) {
        Assertions.assertEquals(output, minimumEqualSumOfTwoArraysAfterReplacingZeros.minSum(nums1, nums2));
    }

    @Test
    void test0() {
        test(12, new int[] { 3, 2, 0, 1, 0 }, new int[] { 6, 5, 0 });
    }

    @Test
    void test1() {
        test(-1, new int[] { 2, 0, 2, 0 }, new int[] { 1, 4 });
    }
}
