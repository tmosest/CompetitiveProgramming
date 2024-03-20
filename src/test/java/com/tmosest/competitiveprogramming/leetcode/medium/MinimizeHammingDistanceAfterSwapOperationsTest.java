package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("list")
@Tag("wc223")
@DisplayName("LeetCode: 1722. Minimize Hamming Distance After Swap Operations")
class MinimizeHammingDistanceAfterSwapOperationsTest {
    private MinimizeHammingDistanceAfterSwapOperations minimizeHammingDistanceAfterSwapOperations;

    @BeforeEach
    void setup() {
        minimizeHammingDistanceAfterSwapOperations = new MinimizeHammingDistanceAfterSwapOperations();
    }

    private void test(int output, int[] source, int[] target, int[][] allowedSwaps) {
        Assertions.assertEquals(output,
                minimizeHammingDistanceAfterSwapOperations.minimumHammingDistance(source, target, allowedSwaps));
    }

    @Test
    void test0() {
        test(1, new int[] { 1, 2, 3, 4 }, new int[] { 2, 1, 4, 5 }, new int[][] { { 0, 1 }, { 2, 3 } });
    }
}
