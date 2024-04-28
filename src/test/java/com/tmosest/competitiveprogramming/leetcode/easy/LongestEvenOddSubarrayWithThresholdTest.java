package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc352")
@DisplayName("LeetCode: 2760. Longest Even Odd Subarray With Threshold")
class LongestEvenOddSubarrayWithThresholdTest {
    private LongestEvenOddSubarrayWithThreshold longestEvenOddSubarrayWithThreshold;

    @BeforeEach
    void setup() {
        longestEvenOddSubarrayWithThreshold = new LongestEvenOddSubarrayWithThreshold();
    }

    private void test(int output, int[] nums, int threshold) {
        Assertions.assertEquals(output,
                longestEvenOddSubarrayWithThreshold.longestAlternatingSubarray(nums, threshold));
    }

    @Test
    void test0() {
        test(3, new int[] { 3, 2, 5, 4 }, 5);
    }

    @Test
    void test1() {
        test(1, new int[] { 1, 2 }, 2);
    }

    @Test
    void test2() {
        test(3, new int[] { 2, 3, 4, 5 }, 4);
    }
}
