package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("graph")
@Tag("dynamic")
@Tag("depthFirstSearch")
@Tag("wc369")
@DisplayName("LeetCode: 2920. Maximum Points After Collecting Coins From All Nodes")
class MaximumPointsAfterCollectingCoinsFromAllNodesTest {
    private MaximumPointsAfterCollectingCoinsFromAllNodes maximumPointsAfterCollectingCoinsFromAllNodes;

    @BeforeEach
    void setup() {
        maximumPointsAfterCollectingCoinsFromAllNodes = new MaximumPointsAfterCollectingCoinsFromAllNodes();
    }

    private void test(int output, int[][] edges, int[] coins, int k) {
        Assertions.assertEquals(output, maximumPointsAfterCollectingCoinsFromAllNodes.maximumPoints(edges, coins, k));
    }

    @Test
    void test0() {
        test(11, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 } }, new int[] { 10, 10, 3, 3 }, 5);
    }

    @Test
    void test1() {
        test(16, new int[][] { { 0, 1 }, { 0, 2 } }, new int[] { 8, 4, 4 }, 0);
    }
}
