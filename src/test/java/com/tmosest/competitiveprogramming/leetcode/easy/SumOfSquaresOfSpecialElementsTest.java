package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc354")
@DisplayName("LeetCode: 2778. Sum of Squares of Special Elements")
class SumOfSquaresOfSpecialElementsTest {
    private SumOfSquaresOfSpecialElements sumOfSquaresOfSpecialElements;

    @BeforeEach
    void setup() {
        sumOfSquaresOfSpecialElements = new SumOfSquaresOfSpecialElements();
    }

    private void test(int output, int[] nums) {
        Assertions.assertEquals(output, sumOfSquaresOfSpecialElements.sumOfSquares(nums));
    }

    @Test
    void test0() {
        test(21, new int[] { 1, 2, 3, 4 });
    }

    @Test
    void test1() {
        test(63, new int[] { 2, 7, 1, 19, 18, 3 });
    }
}
