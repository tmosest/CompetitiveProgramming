package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 3184. Count Pairs That Form a Complete Day I")
@Tag("wc402")
class CountPairsThatFormCompleteDayOneTest {
    private CountPairsThatFormCompleteDayOne countPairsThatFormCompleteDayOne;

    @BeforeEach
    void setup() {
        countPairsThatFormCompleteDayOne = new CountPairsThatFormCompleteDayOne();
    }

    private void test(int output, int[] hours) {
        Assertions.assertEquals(output, countPairsThatFormCompleteDayOne.countCompleteDayPairs(hours));
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
