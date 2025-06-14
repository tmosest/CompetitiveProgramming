package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("wcx")
@Tag("segmentTree")
@DisplayName("LeetCode: 3569. Maximize Count of Distinct Primes After Split")
class MaximizeCountOfDistinctPrimesAfterSplitTest {
    private MaximizeCountOfDistinctPrimesAfterSplit maximizeCountOfDistinctPrimesAfterSplit;

    @BeforeEach
    void setup() {
        maximizeCountOfDistinctPrimesAfterSplit = new MaximizeCountOfDistinctPrimesAfterSplit();
    }

    private void test(int[] output, int[] nums, int[][] queries) {
        Assertions.assertEquals(output, maximizeCountOfDistinctPrimesAfterSplit.maximumCount(nums, queries));
    }

    @Test
    void test0() {
        test(new int[] {3,4}, new int[] {2,1,3,1,2}, new int[][] {{1,2}, {3,3}});
    }
}
