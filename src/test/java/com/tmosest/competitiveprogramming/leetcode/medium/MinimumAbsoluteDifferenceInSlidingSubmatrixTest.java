package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wcx")
@Tag("matrix")
@DisplayName("LeetCode: 3567. Minimum Absolute Difference in Sliding Submatrix")
class MinimumAbsoluteDifferenceInSlidingSubmatrixTest {
    private MinimumAbsoluteDifferenceInSlidingSubmatrix minimumAbsoluteDifferenceInSlidingSubmatrix;

    @BeforeEach
    void setup() {
        minimumAbsoluteDifferenceInSlidingSubmatrix = new MinimumAbsoluteDifferenceInSlidingSubmatrix();
    }

    private void test(int[][] output, int[][] grid, int k) {
        Assertions.assertArrayEquals(output, minimumAbsoluteDifferenceInSlidingSubmatrix.minAbsDiff(grid, k));
    }

    @Test
    void test0() {
        test(new int[][] {{2}}, new int[][] {{1,8}, {3,-2}}, 2);
    }
}
