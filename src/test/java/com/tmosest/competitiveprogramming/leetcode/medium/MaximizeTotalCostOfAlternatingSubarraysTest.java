package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3196. Maximize Total Cost of Alternating Subarrays")
@Tag("wc403")
class MaximizeTotalCostOfAlternatingSubarraysTest {
    private MaximizeTotalCostOfAlternatingSubarrays maximizeTotalCostOfAlternatingSubarrays;

    @BeforeEach
    void setup() {
        maximizeTotalCostOfAlternatingSubarrays = new MaximizeTotalCostOfAlternatingSubarrays();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, maximizeTotalCostOfAlternatingSubarrays.maximumTotalCost(nums));
    }
    /*
     * Example 1
     * Input: nums = [1,-2,3,4]
     * Output: 10
     * null
     */

    @Test
    void test_1() {
        test(10, new int[] { 1, -2, 3, 4 });
    }
    /*
     * Example 2
     * Input: nums = [1,-1,1,-1]
     * Output: 4
     * null
     */

    @Test
    void test_2() {
        test(4, new int[] { 1, -1, 1, -1 });
    }
    /*
     * Example 3
     * Input: nums = [0]
     * Output: 0
     * null
     */

    @Test
    void test_3() {
        test(0, new int[] { 0 });
    }
    /*
     * Example 4
     * Input: nums = [1,-1]
     * Output: 2
     * null
     */

    @Test
    void test_4() {
        test(2, new int[] { 1, -1 });
    }

}
