package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc388")
@DisplayName("LeetCode: 3074. Apple Redistribution into Boxes")
class AppleRedistributionIntoBoxesTest {
    private AppleRedistributionIntoBoxes appleRedistributionIntoBoxes;

    @BeforeEach
    void setup() {
        appleRedistributionIntoBoxes = new AppleRedistributionIntoBoxes();
    }

    private void test(int output, int[] apple, int[] capacity) {
        Assertions.assertEquals(output, appleRedistributionIntoBoxes.minimumBoxes(apple, capacity));
    }

    @Test
    void test0() {
        test(2, new int[] { 1, 3, 2 }, new int[] { 4, 3, 1, 5, 2 });
    }
}
