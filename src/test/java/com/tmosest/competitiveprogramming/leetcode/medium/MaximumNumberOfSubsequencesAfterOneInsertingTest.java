package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 3628. Maximum Number of Subsequences After One Inserting")
@Tag("wc460")
class MaximumNumberOfSubsequencesAfterOneInsertingTest {
    private MaximumNumberOfSubsequencesAfterOneInserting maximumNumberOfSubsequencesAfterOneInserting;

    @BeforeEach
    void setup() {
        maximumNumberOfSubsequencesAfterOneInserting = new MaximumNumberOfSubsequencesAfterOneInserting();
    }

    private void test(long output, String s) {
        Assertions.assertEquals(output, maximumNumberOfSubsequencesAfterOneInserting.numOfSubsequences(s));
    }
    /*
     * Example 1
     * Input: s = "LMCT"
     * Output: 2
     * null
     */

    @Test
    void test1() {
        test(2, "LMCT");
    }
    /*
     * Example 2
     * Input: s = "LCCT"
     * Output: 4
     * null
     */

    @Test
    void test2() {
        test(4, "LCCT");
    }
    /*
     * Example 3
     * Input: s = "L"
     * Output: 0
     * null
     */

    @Test
    void test3() {
        test(0, "L");
    }
}
