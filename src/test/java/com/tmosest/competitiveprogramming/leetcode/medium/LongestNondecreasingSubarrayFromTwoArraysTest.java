package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@Tag("wc353")
@Tag("array")
@DisplayName("LeetCode: 2771. Longest Non-decreasing Subarray From Two Arrays")
class LongestNondecreasingSubarrayFromTwoArraysTest {
    private LongestNondecreasingSubarrayFromTwoArrays longestNondecreasingSubarrayFromTwoArrays;

    @BeforeEach
    void setup() {
        longestNondecreasingSubarrayFromTwoArrays = new LongestNondecreasingSubarrayFromTwoArrays();
    }

    private void test(int output, int[] nums1, int[] nums2) {
        Assertions.assertEquals(output, longestNondecreasingSubarrayFromTwoArrays.maxNonDecreasingLength(nums1, nums2));
    }

    @Test
    void test0() {
        test(2, new int[] { 2, 3, 1 }, new int[] { 1, 2, 1 });
    }
}
