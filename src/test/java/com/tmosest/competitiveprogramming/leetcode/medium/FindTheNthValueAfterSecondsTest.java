package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3179. Find the N-th Value After K Seconds")
@Tag("wc401")
class FindTheNthValueAfterSecondsTest {
    private FindTheNthValueAfterSeconds findTheNthValueAfterSeconds;

    @BeforeEach
    void setup() {
        findTheNthValueAfterSeconds = new FindTheNthValueAfterSeconds();
    }

    private void test(int output, int n, int k) {
        Assertions.assertEquals(output, findTheNthValueAfterSeconds.valueAfterKSeconds(n, k));
    }
    /*
     * Example 1
     * Input: n = 4, k = 5
     * Output: 56
     * null
     */

    @Test
    void test1() {
        test(56, 4, 5);
    }
    /*
     * Example 2
     * Input: n = 5, k = 3
     * Output: 35
     * null
     */

    @Test
    void test2() {
        test(35, 5, 3);
    }
}
