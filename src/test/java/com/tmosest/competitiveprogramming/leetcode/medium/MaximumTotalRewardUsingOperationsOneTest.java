package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3180. Maximum Total Reward Using Operations I")
@Tag("wc401")
class MaximumTotalRewardUsingOperationsOneTest {
    private MaximumTotalRewardUsingOperationsOne maximumTotalRewardUsingOperationsOne;

    @BeforeEach
    void setup() {
        maximumTotalRewardUsingOperationsOne = new MaximumTotalRewardUsingOperationsOne();
    }

    private void test(int output, int[] rewardValues) {
        Assertions.assertEquals(output, maximumTotalRewardUsingOperationsOne.maxTotalReward(rewardValues));
    }
    /*
     * Example 1
     * Input: rewardValues = [1,1,3,3]
     * Output: 4
     * null
     */

    @Test
    void test1() {
        test(4, new int[] { 1, 1, 3, 3 });
    }
    /*
     * Example 2
     * Input: rewardValues = [1,6,4,3,2]
     * Output: 11
     * null
     */

    @Test
    void test2() {
        test(11, new int[] { 1, 6, 4, 3, 2 });
    }
}
