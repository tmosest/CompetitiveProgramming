package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc351")
@DisplayName("LeetCode: 2748. Number of Beautiful Pairs")
class NumberOfBeautifulPairsTest {
    private NumberOfBeautifulPairs numberOfBeautifulPairs;

    @BeforeEach
    void setup() {
        numberOfBeautifulPairs = new NumberOfBeautifulPairs();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, numberOfBeautifulPairs.countBeautifulPairs(nums));
    }

    @Test
    void test0() {
        test(5, new int[] { 2, 5, 1, 4 });
    }
}
