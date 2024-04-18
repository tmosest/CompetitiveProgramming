package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("math")
@Tag("wc359")
@Tag("greedy")
@DisplayName("LeetCode: 2829. Determine the Minimum Sum of a k-avoiding Array")
class DetermineTheMinimumSumOfKavoidingArrayTest {
    private DetermineTheMinimumSumOfKavoidingArray determineTheMinimumSumOfKavoidingArray;

    @BeforeEach
    void setup() {
        determineTheMinimumSumOfKavoidingArray = new DetermineTheMinimumSumOfKavoidingArray();
    }

    private void test(int output, int n, int k) {
        Assertions.assertEquals(output, determineTheMinimumSumOfKavoidingArray.minimumSum(n, k));
    }

    @Test
    void test0() {
        test(18, 5, 4);
    }

    @Test
    void test1() {
        test(3, 2, 6);
    }
}
