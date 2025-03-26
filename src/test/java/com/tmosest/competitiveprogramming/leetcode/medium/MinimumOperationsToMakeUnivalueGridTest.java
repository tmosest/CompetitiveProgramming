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
@DisplayName("LeetCode: 2033. Minimum Operations to Make a Uni-Value Grid")
class MinimumOperationsToMakeUnivalueGridTest {
    private MinimumOperationsToMakeUnivalueGrid minimumOperationsToMakeUnivalueGrid;

    @BeforeEach
    void setup() {
        minimumOperationsToMakeUnivalueGrid = new MinimumOperationsToMakeUnivalueGrid();
    }

    private void test(int output, int[][] grid, int x) {
        Assertions.assertEquals(output, minimumOperationsToMakeUnivalueGrid.minOperations(grid, x));
    }

    @Test
    void test0() {
        test(4, new int[][] { { 2, 4 }, { 6, 8 } }, 2);
    }

    @Test
    void test1() {
        test(5, new int[][] { { 1, 5 }, { 2, 3 } }, 1);
    }

    @Test
    void test2() {
        test(-1, new int[][] { { 1, 2 }, { 3, 4 } }, 2);
    }
}
