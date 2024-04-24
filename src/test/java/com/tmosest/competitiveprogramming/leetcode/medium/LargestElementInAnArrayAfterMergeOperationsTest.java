package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("greedy")
@Tag("wc355")
@Tag("array")
@DisplayName("LeetCode: 2789. Largest Element in an Array after Merge Operations")
class LargestElementInAnArrayAfterMergeOperationsTest {
    private LargestElementInAnArrayAfterMergeOperations largestElementInAnArrayAfterMergeOperations;

    @BeforeEach
    void setup() {
        largestElementInAnArrayAfterMergeOperations = new LargestElementInAnArrayAfterMergeOperations();
    }

    private void test(long output, int[] nums) {
        Assertions.assertEquals(output, largestElementInAnArrayAfterMergeOperations.maxArrayValue(nums));
    }

    @Test
    void test0() {
        test(21, new int[] { 2, 3, 7, 9, 3 });
    }

    @Test
    void test1() {
        test(11, new int[] { 5, 3, 3 });
    }
}
