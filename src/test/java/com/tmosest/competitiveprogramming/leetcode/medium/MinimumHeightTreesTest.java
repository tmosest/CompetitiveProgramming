package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("topologicalSort")
@Tag("wcx")
@Tag("graph")
@Tag("depthFirstSearch")
@Tag("breadthFirstSearch")
@DisplayName("LeetCode: 310. Minimum Height Trees")
class MinimumHeightTreesTest {
    private MinimumHeightTrees minimumHeightTrees;

    @BeforeEach
    void setup() {
        minimumHeightTrees = new MinimumHeightTrees();
    }

    private void test(List<Integer> output, int n, int[][] edges) {
        Assertions.assertEquals(output, minimumHeightTrees.findMinHeightTrees(n, edges));
    }

    @Test
    void test0() {
        test(List.of(1), 4, new int[][] { { 1, 0 }, { 1, 2 }, { 1, 3 } });
    }

    /*
    @Test
    void test1() {
        test(List.of(3, 4), 6, new int[][] { { 3, 0 }, { 3, 1 }, { 3, 2 }, { 3, 4 }, { 5, 4 } });
    }
    */
}
