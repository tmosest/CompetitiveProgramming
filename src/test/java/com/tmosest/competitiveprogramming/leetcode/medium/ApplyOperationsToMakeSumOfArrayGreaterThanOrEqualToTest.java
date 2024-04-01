package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("greedy")
@Tag("wc390")
@DisplayName("LeetCode: 3091. Apply Operations to Make Sum of Array Greater Than or Equal to k")
class ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualToTest {
    private ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTo applyOperationsToMakeSumOfArrayGreaterThanOrEqualTo;

    @BeforeEach
    void setup() {
        applyOperationsToMakeSumOfArrayGreaterThanOrEqualTo = new ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTo();
    }

    private void test(int output, int k) {
        Assertions.assertEquals(output, applyOperationsToMakeSumOfArrayGreaterThanOrEqualTo.minOperations(k));
    }

    @Test
    void test0() {
        test(5, 11);
    }

    @Test
    void test1() {
        test(0, 1);
    }
}
