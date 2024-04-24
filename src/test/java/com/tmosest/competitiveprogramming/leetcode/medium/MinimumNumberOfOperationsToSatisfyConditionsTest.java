package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("matrix")
@Tag("wc394")
@Tag("dynamic")
@Tag("array")
@DisplayName("LeetCode: 3122. Minimum Number of Operations to Satisfy Conditions")
class MinimumNumberOfOperationsToSatisfyConditionsTest {
    private MinimumNumberOfOperationsToSatisfyConditions minimumNumberOfOperationsToSatisfyConditions;

    @BeforeEach
    void setup() {
        minimumNumberOfOperationsToSatisfyConditions = new MinimumNumberOfOperationsToSatisfyConditions();
    }

    private void test(int output, int[][] grid) {
        Assertions.assertEquals(output, minimumNumberOfOperationsToSatisfyConditions.minimumOperations(grid));
    }

    @Test
    void test0() {
        test(0, new int[][] { { 1, 0, 2 }, { 1, 0, 2 } });
    }

    @Test
    void test1() {
        test(3, new int[][] { { 1, 1, 1 }, { 0, 0, 0 } });
    }

    @Test
    void test2() {
        test(2, new int[][] { { 1 }, { 2 }, { 3 } });
    }
}
