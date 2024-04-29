package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("bitmask")
@Tag("wc351")
@DisplayName("LeetCode: 2749. Minimum Operations to Make the Integer Zero")
class MinimumOperationsToMakeTheIntegerZeroTest {
    private MinimumOperationsToMakeTheIntegerZero minimumOperationsToMakeTheIntegerZero;

    @BeforeEach
    void setup() {
        minimumOperationsToMakeTheIntegerZero = new MinimumOperationsToMakeTheIntegerZero();
    }

    private void test(int output, int num1, int num2) {
        Assertions.assertEquals(output, minimumOperationsToMakeTheIntegerZero.makeTheIntegerZero(num1, num2));
    }

    @Test
    void test0() {
        test(3, 3, -2);
    }
}
