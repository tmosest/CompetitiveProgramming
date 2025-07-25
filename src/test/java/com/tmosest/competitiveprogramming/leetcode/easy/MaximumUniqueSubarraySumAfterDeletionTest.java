package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wcx")
@DisplayName("LeetCode: 3487. Maximum Unique Subarray Sum After Deletion")
class MaximumUniqueSubarraySumAfterDeletionTest {
    private MaximumUniqueSubarraySumAfterDeletion maximumUniqueSubarraySumAfterDeletion;

    @BeforeEach
    void setup() {
        maximumUniqueSubarraySumAfterDeletion = new MaximumUniqueSubarraySumAfterDeletion();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, maximumUniqueSubarraySumAfterDeletion.maxSum(nums));
    }

    @Test
    void test0() {
        test(15, new int[] { 1, 2, 3, 4, 5 });
    }

    @Test
    void test1() {
        test(1, new int[] { 1,1,0,1,1 });
    }

    @Test
    void test2() {
        test(3, new int[] { 1,2,-1,-2,1,0,-1 });
    }
}
