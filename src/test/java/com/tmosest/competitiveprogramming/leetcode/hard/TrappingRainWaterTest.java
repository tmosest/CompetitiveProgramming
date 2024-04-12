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
@DisplayName("LeetCode: 42. Trapping Rain Water")
class TrappingRainWaterTest {
    private TrappingRainWater trappingRainWater;

    @BeforeEach
    void setup() {
        trappingRainWater = new TrappingRainWater();
    }

    private void test(int output, int[] height) {
        Assertions.assertEquals(output, trappingRainWater.trap(height));
    }

    @Test
    void test0() {
        test(6, new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
    }

    @Test
    void test1() {
        test(9, new int[] { 4, 2, 0, 3, 2, 5 });
    }
}
