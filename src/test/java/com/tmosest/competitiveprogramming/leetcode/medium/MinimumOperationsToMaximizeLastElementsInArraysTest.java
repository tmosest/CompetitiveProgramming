package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc371")
@DisplayName("LeetCode: 2934. Minimum Operations to Maximize Last Elements in Arrays")
class MinimumOperationsToMaximizeLastElementsInArraysTest {
    private MinimumOperationsToMaximizeLastElementsInArrays minimumOperationsToMaximizeLastElementsInArrays;

    @BeforeEach
    void setup() {
        minimumOperationsToMaximizeLastElementsInArrays = new MinimumOperationsToMaximizeLastElementsInArrays();
    }

    private void test(int output, int[] nums1, int[] nums2) {
        Assertions.assertEquals(output, minimumOperationsToMaximizeLastElementsInArrays.minOperations(nums1, nums2));
    }

    @Test
    void test0() {
        test(1, new int[] { 1, 2, 7 }, new int[] { 4, 5, 3 });
    }

    @Test
    void test1() {
        test(2, new int[] { 2, 3, 4, 5, 9 }, new int[] { 8, 8, 4, 4, 4 });
    }

    @Test
    void test2() {
        test(-1, new int[] { 1, 5, 4 }, new int[] { 2, 5, 3 });
    }
}
