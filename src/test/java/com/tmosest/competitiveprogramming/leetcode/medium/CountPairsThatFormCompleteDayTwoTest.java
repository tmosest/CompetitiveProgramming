package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3185. Count Pairs That Form a Complete Day II")
@Tag("wc402")
class CountPairsThatFormCompleteDayTwoTest {
    private CountPairsThatFormCompleteDayTwo countPairsThatFormCompleteDayTwo;

    @BeforeEach
    void setup() {
        countPairsThatFormCompleteDayTwo = new CountPairsThatFormCompleteDayTwo();
    }

    private void test(long output, int[] hours) {
        Assertions.assertEquals(output, countPairsThatFormCompleteDayTwo.countCompleteDayPairs(hours));
    }
    /*
     * Example 1
     * Input: hours = [12,12,30,24,24]
     * Output: 2
     * null
     */

    @Test
    void test_1() {
        test(2, new int[] { 12, 12, 30, 24, 24 });
    }
    /*
     * Example 2
     * Input: hours = [72,48,24,3]
     * Output: 3
     * null
     */

    @Test
    void test_2() {
        test(3, new int[] { 72, 48, 24, 3 });
    }

}
