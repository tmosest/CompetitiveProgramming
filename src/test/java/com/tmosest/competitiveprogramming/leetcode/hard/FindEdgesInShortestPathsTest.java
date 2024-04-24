package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("shortestPath")
@Tag("wc394")
@Tag("priorityQueue")
@Tag("graph")
@Tag("depthFirstSearch")
@Tag("breadthFirstSearch")
@Tag("dijkstra")
@DisplayName("LeetCode: 3123. Find Edges in Shortest Paths")
class FindEdgesInShortestPathsTest {
    private FindEdgesInShortestPaths findEdgesInShortestPaths;

    @BeforeEach
    void setup() {
        findEdgesInShortestPaths = new FindEdgesInShortestPaths();
    }

    private void test(boolean[] output, int n, int[][] edges) {
        Assertions.assertArrayEquals(output, findEdgesInShortestPaths.findAnswer(n, edges));
    }

    @Test
    void test0() {
        test(new boolean[] { true, true, true, false, true, true, true, false }, 6, new int[][] { { 0, 1, 4 },
                { 0, 2, 1 }, { 1, 3, 2 }, { 1, 4, 3 }, { 1, 5, 1 }, { 2, 3, 1 }, { 3, 5, 3 }, { 4, 5, 2 } });
    }
}
