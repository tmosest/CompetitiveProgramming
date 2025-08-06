package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@DisplayName("LeetCode: 3181. Maximum Total Reward Using Operations II")
@Tag("wc401")
class MaximumTotalRewardUsingOperationsTwoTest {
    private MaximumTotalRewardUsingOperationsTwo maximumTotalRewardUsingOperationsTwo;

    @BeforeEach
    void setup() {
        maximumTotalRewardUsingOperationsTwo = new MaximumTotalRewardUsingOperationsTwo();
    }

    private void test(int output, int[] rewardValues) {
        Assertions.assertEquals(output, maximumTotalRewardUsingOperationsTwo.maxTotalReward(rewardValues));
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
