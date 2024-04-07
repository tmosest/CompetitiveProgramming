package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc392")
@DisplayName("LeetCode: 3107. Minimum Operations to Make Median of Array Equal to K")
class MinimumOperationsToMakeMedianOfArrayEqualToTest {
    private MinimumOperationsToMakeMedianOfArrayEqualTo minimumOperationsToMakeMedianOfArrayEqualTo;

    @BeforeEach
    void setup() {
        minimumOperationsToMakeMedianOfArrayEqualTo = new MinimumOperationsToMakeMedianOfArrayEqualTo();
    }

    private void test(long output, int[] nums, int k) {
        Assertions.assertEquals(output,
                minimumOperationsToMakeMedianOfArrayEqualTo.minOperationsToMakeMedianK(nums, k));
    }

    @Test
    void test0() {
        test(2, new int[] { 2, 5, 6, 8, 5 }, 4);
    }

    @Test
    void test1() {
        test(3, new int[] { 2, 5, 6, 8, 5 }, 7);
    }

    @Test
    void test2() {
        test(0, new int[] { 1, 2, 3, 4, 5, 6 }, 4);
    }
}
