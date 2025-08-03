package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3639. Minimum Time to Activate String")
@Tag("wc461")
class MinimumTimeToActivateStringTest {
    private MinimumTimeToActivateString minimumTimeToActivateString;

    @BeforeEach
    void setup() {
        minimumTimeToActivateString = new MinimumTimeToActivateString();
    }

    private void test(int output, String s, int[] order, int k) {
        Assertions.assertEquals(output, minimumTimeToActivateString.minTime(s, order, k));
    }
    /*
     * Example 1
     * Input: s = "abc", order = [1,0,2], k = 2
     * Output: 0
     * null
     */

    @Test
    void test1() {
        test(0, "abc", new int[] {1,2,3}, 2);
    }
    /*
     * Example 2
     * Input: s = "cat", order = [0,2,1], k = 6
     * Output: 2
     * null
     */

    @Test
    void test2() {
        test(2, "cat", new int[] {0,2,1}, 6);
    }
    /*
     * Example 3
     * Input: s = "xy", order = [0,1], k = 4
     * Output: -1
     * null
     */

    @Test
    void test3() {
        test(-1, "xy", new int[] {0,1}, 4);
    }
}
