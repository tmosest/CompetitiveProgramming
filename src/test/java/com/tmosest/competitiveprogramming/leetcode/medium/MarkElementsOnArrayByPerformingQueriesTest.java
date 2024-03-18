package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("bwc126")
@DisplayName("LeetCode: 3080. Mark Elements on Array by Performing Queries")
class MarkElementsOnArrayByPerformingQueriesTest {
    private MarkElementsOnArrayByPerformingQueries markElementsOnArrayByPerformingQueries;

    @BeforeEach
    void setup() {
        markElementsOnArrayByPerformingQueries = new MarkElementsOnArrayByPerformingQueries();
    }

    private void test(long[] output, int[] nums, int[][] queries) {
        Assertions.assertArrayEquals(output, markElementsOnArrayByPerformingQueries.unmarkedSumArray(nums, queries));
    }

    @Test
    void test0() {
        test(new long[] { 8, 3, 0 }, new int[] { 1, 2, 2, 1, 2, 3, 1 }, new int[][] { { 1, 2 }, { 3, 3 }, { 4, 2 } });
    }
}
