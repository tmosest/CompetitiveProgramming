package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("graph")
@Tag("wc454")
@DisplayName("LeetCode: 3585. Find Weighted Median Node in Tree")
class FindWeightedMedianNodeInTreeTest {
    private FindWeightedMedianNodeInTree findWeightedMedianNodeInTree;

    @BeforeEach
    void setup() {
        findWeightedMedianNodeInTree = new FindWeightedMedianNodeInTree();
    }

    private void test(int[] output, int n, int[][] edges, int[][] queries) {
        Assertions.assertArrayEquals(output, findWeightedMedianNodeInTree.findMedian(n, edges, queries));
    }

    @Test
    void test0() {
        test(new int[] {0, 1}, 2, new int[][] {{0,1,7}}, new int[][] {{1,0}, {0,1}});
    }
}
