package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("math")
@Tag("wc351")
@Tag("dynamic")
@Tag("array")
@DisplayName("LeetCode: 2750. Ways to Split Array Into Good Subarrays")
class WaysToSplitArrayIntoGoodSubarraysTest {
    private WaysToSplitArrayIntoGoodSubarrays waysToSplitArrayIntoGoodSubarrays;

    @BeforeEach
    void setup() {
        waysToSplitArrayIntoGoodSubarrays = new WaysToSplitArrayIntoGoodSubarrays();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, waysToSplitArrayIntoGoodSubarrays.numberOfGoodSubarraySplits(nums));
    }

    @Test
    void test0() {
        test(3, new int[] { 0, 1, 0, 0, 1 });
    }
}
