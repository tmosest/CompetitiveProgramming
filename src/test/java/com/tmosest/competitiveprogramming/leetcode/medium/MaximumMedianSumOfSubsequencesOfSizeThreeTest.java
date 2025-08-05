package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3627. Maximum Median Sum of Subsequences of Size 3")
@Tag("wc460")
class MaximumMedianSumOfSubsequencesOfSizeThreeTest {
    private MaximumMedianSumOfSubsequencesOfSizeThree maximumMedianSumOfSubsequencesOfSizeThree;

    @BeforeEach
    void setup() {
        maximumMedianSumOfSubsequencesOfSizeThree = new MaximumMedianSumOfSubsequencesOfSizeThree();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, maximumMedianSumOfSubsequencesOfSizeThree.maximumMedianSum(nums));
    }
    /*
     * Example 1
     * Input: nums = [2,1,3,2,1,3]
     * Output: 5
     * null
     */

    @Test
    void test1() {
        test(5, new int[] { 2, 1, 3, 2, 1, 3 });
    }
    /*
     * Example 2
     * Input: nums = [1,1,10,10,10,10]
     * Output: 20
     * null
     */

    @Test
    void test2() {
        test(20, new int[] { 1, 1, 10, 10, 10, 10 });
    }
}
