package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("breadthFirstSearch")
@Tag("dynamic")
@Tag("matrix")
@Tag("wc362")
@DisplayName("LeetCode: 2850. Minimum Moves to Spread Stones Over Grid")
class MinimumMovesToSpreadStonesOverGridTest {
    private MinimumMovesToSpreadStonesOverGrid minimumMovesToSpreadStonesOverGrid;

    @BeforeEach
    void setup() {
        minimumMovesToSpreadStonesOverGrid = new MinimumMovesToSpreadStonesOverGrid();
    }

    private void test(int output, int[][] grid) {
        Assertions.assertEquals(output, minimumMovesToSpreadStonesOverGrid.minimumMoves(grid));
    }

    @Test
    void test0() {
        test(3, new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 1, 2, 1 } });
    }

    @Test
    void test1() {
        test(4, new int[][] { { 1, 3, 0 }, { 1, 0, 0 }, { 1, 0, 3 } });
    }
}
