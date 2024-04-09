package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("wc366")
@DisplayName("LeetCode: 2897. Apply Operations on Array to Maximize Sum of Squares")
class ApplyOperationsOnArrayToMaximizeSumOfSquaresTest {
    private ApplyOperationsOnArrayToMaximizeSumOfSquares applyOperationsOnArrayToMaximizeSumOfSquares;

    @BeforeEach
    void setup() {
        applyOperationsOnArrayToMaximizeSumOfSquares = new ApplyOperationsOnArrayToMaximizeSumOfSquares();
    }

    private void test(int output, List<Integer> nums, int k) {
        Assertions.assertEquals(output, applyOperationsOnArrayToMaximizeSumOfSquares.maxSum(nums, k));
    }

    @Test
    void test0() {
        test(261, List.of(2, 6, 5, 8), 2);
    }

    @Test
    void test1() {
        test(90, List.of(4, 5, 4, 7), 3);
    }
}
