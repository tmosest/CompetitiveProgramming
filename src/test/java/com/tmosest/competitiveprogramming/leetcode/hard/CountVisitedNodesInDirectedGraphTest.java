package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("graph")
@Tag("wc365")
@DisplayName("LeetCode: 2876. Count Visited Nodes in a Directed Graph")
class CountVisitedNodesInDirectedGraphTest {
    private CountVisitedNodesInDirectedGraph countVisitedNodesInDirectedGraph;

    @BeforeEach
    void setup() {
        countVisitedNodesInDirectedGraph = new CountVisitedNodesInDirectedGraph();
    }

    private void test(int[] output, List<Integer> edges) {
        Assertions.assertArrayEquals(output, countVisitedNodesInDirectedGraph.countVisitedNodes(edges));
    }

    @Test
    void test0() {
        test(new int[] { 3, 3, 3, 4 }, List.of(1, 2, 0, 0));
    }
}
