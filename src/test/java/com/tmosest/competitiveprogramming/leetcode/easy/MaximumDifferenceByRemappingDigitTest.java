package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("math")
@Tag("wcx")
@Tag("greedy")
@DisplayName("LeetCode: 2566. Maximum Difference by Remapping a Digit")
class MaximumDifferenceByRemappingDigitTest {
    private MaximumDifferenceByRemappingDigit maximumDifferenceByRemappingDigit;

    @BeforeEach
    void setup() {
        maximumDifferenceByRemappingDigit = new MaximumDifferenceByRemappingDigit();
    }

    private void test(int output, int num) {
        Assertions.assertEquals(output, maximumDifferenceByRemappingDigit.minMaxDifference(num));
    }

    @Test
    void test0() {
        test(99009, 11891);
    }

    @Test
    void test1() {
        test(99, 90);
    }
}
