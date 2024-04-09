package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc365")
@DisplayName("LeetCode: 2875. Minimum Size Subarray in Infinite Array")
class MinimumSizeSubarrayInInfiniteArrayTest {
    private MinimumSizeSubarrayInInfiniteArray minimumSizeSubarrayInInfiniteArray;

    @BeforeEach
    void setup() {
        minimumSizeSubarrayInInfiniteArray = new MinimumSizeSubarrayInInfiniteArray();
    }

    private void test(int output, int[] nums, int target) {
        Assertions.assertEquals(output, minimumSizeSubarrayInInfiniteArray.minSizeSubarray(nums, target));
    }

    @Test
    void test0() {
        test(2, new int[] { 1, 2, 3 }, 5);
    }
}
