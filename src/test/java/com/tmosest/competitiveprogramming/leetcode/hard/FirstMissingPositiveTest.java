package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("wcx")
@DisplayName("LeetCode: 41. First Missing Positive")
class FirstMissingPositiveTest {
    private FirstMissingPositive firstMissingPositive;

    @BeforeEach
    void setup() {
        firstMissingPositive = new FirstMissingPositive();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, firstMissingPositive.firstMissingPositive(nums));
    }

    @Test
    void test0() {
        test(3, new int[] { 1, 2, 0 });
    }
}
