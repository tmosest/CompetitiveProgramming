package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc137")
@DisplayName("LeetCode: 1051. Height Checker")
class HeightCheckerTest {
    private HeightChecker heightChecker;

    @BeforeEach
    void setup() {
        heightChecker = new HeightChecker();
    }

    private void test(int output, int[] heights) {
        Assertions.assertEquals(output, heightChecker.heightChecker(heights));
    }

    @Test
    void test0() {
        test(3, new int[] { 1, 1, 4, 2, 1, 3 });
    }
}
