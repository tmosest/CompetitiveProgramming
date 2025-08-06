package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 3178. Find the Child Who Has the Ball After K Seconds")
@Tag("wc401")
class FindTheChildWhoHasTheBallAfterSecondsTest {
    private FindTheChildWhoHasTheBallAfterSeconds findTheChildWhoHasTheBallAfterSeconds;

    @BeforeEach
    void setup() {
        findTheChildWhoHasTheBallAfterSeconds = new FindTheChildWhoHasTheBallAfterSeconds();
    }

    private void test(int output, int n, int k) {
        Assertions.assertEquals(output, findTheChildWhoHasTheBallAfterSeconds.numberOfChild(n, k));
    }
    /*
     * Example 1
     * Input: n = 3, k = 5
     * Output: 1
     * null
     */

    @Test
    void test1() {
        test(1, 3, 5);
    }
    /*
     * Example 2
     * Input: n = 5, k = 6
     * Output: 2
     * null
     */

    @Test
    void test2() {
        test(2, 5, 6);
    }
    /*
     * Example 3
     * Input: n = 4, k = 2
     * Output: 2
     * null
     */

    @Test
    void test3() {
        test(2, 4, 2);
    }
}
