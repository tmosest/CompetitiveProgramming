package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("prefix")
@Tag("wc353")
@Tag("array")
@DisplayName("LeetCode: 2772. Apply Operations to Make All Array Elements Equal to Zero")
class ApplyOperationsToMakeAllArrayElementsEqualToZeroTest {
    private ApplyOperationsToMakeAllArrayElementsEqualToZero applyOperationsToMakeAllArrayElementsEqualToZero;

    @BeforeEach
    void setup() {
        applyOperationsToMakeAllArrayElementsEqualToZero = new ApplyOperationsToMakeAllArrayElementsEqualToZero();
    }

    private void test(boolean output, int[] nums, int k) {
        Assertions.assertEquals(output, applyOperationsToMakeAllArrayElementsEqualToZero.checkArray(nums, k));
    }

    @Test
    void test0() {
        test(true, new int[] { 2, 2, 3, 1, 1, 0 }, 3);
    }

    @Test
    void test1() {
        test(false, new int[] { 1, 3, 1, 1 }, 2);
    }
}
