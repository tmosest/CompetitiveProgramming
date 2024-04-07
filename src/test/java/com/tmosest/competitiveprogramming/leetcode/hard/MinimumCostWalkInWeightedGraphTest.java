package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("directedGraph")
@Tag("wc392")
@DisplayName("LeetCode: 3108. Minimum Cost Walk in Weighted Graph")
class MinimumCostWalkInWeightedGraphTest {
    private MinimumCostWalkInWeightedGraph minimumCostWalkInWeightedGraph;

    @BeforeEach
    void setup() {
        minimumCostWalkInWeightedGraph = new MinimumCostWalkInWeightedGraph();
    }

    private void test(int[] output, int n, int[][] edges, int[][] query) {
        Assertions.assertArrayEquals(output, minimumCostWalkInWeightedGraph.minimumCost(n, edges, query));
    }

    @Test
    void test0() {
        test(new int[] { 1, -1 }, 5, new int[][] { { 0, 1, 7 }, { 1, 3, 7 }, { 1, 2, 1 } },
                new int[][] { { 0, 3 }, { 3, 4 } });
    }
}
