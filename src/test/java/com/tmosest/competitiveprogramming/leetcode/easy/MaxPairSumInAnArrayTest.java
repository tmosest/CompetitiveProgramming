package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("map")
@Tag("wc358")
@Tag("array")
@DisplayName("LeetCode: 2815. Max Pair Sum in an Array")
class MaxPairSumInAnArrayTest {
    private MaxPairSumInAnArray maxPairSumInAnArray;

    @BeforeEach
    void setup() {
        maxPairSumInAnArray = new MaxPairSumInAnArray();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, maxPairSumInAnArray.maxSum(nums));
    }

    @Test
    void test0() {
        test(88, new int[] { 51, 71, 17, 24, 42 });
    }

    @Test
    void test1() {
        test(-1, new int[] { 1, 2, 3, 4 });
    }
}
