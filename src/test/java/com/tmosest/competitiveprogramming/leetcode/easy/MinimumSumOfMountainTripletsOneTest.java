package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc368")
@DisplayName("LeetCode: 2908. Minimum Sum of Mountain Triplets I")
class MinimumSumOfMountainTripletsOneTest {
    private MinimumSumOfMountainTripletsOne minimumSumOfMountainTripletsOne;

    @BeforeEach
    void setup() {
        minimumSumOfMountainTripletsOne = new MinimumSumOfMountainTripletsOne();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, minimumSumOfMountainTripletsOne.minimumSum(nums));
    }

    @Test
    void test0() {
        test(9, new int[] { 8, 6, 1, 5, 3 });
    }
}
