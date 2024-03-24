package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc380")
@DisplayName("LeetCode: 3005. Count Elements With Maximum Frequency")
class CountElementsWithMaximumFrequencyTest {
    private CountElementsWithMaximumFrequency countElementsWithMaximumFrequency;

    @BeforeEach
    void setup() {
        countElementsWithMaximumFrequency = new CountElementsWithMaximumFrequency();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, countElementsWithMaximumFrequency.maxFrequencyElements(nums));
    }

    @Test
    void test0() {
        test(4, new int[] { 1, 2, 2, 3, 1, 4 });
    }

    @Test
    void test1() {
        test(5, new int[] { 1, 2, 3, 4, 5 });
    }
}
