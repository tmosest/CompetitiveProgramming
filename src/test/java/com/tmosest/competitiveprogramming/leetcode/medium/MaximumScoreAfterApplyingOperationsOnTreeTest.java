package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("depthFirstSearch")
@Tag("tree")
@Tag("wc370")
@DisplayName("LeetCode: 2925. Maximum Score After Applying Operations on a Tree")
class MaximumScoreAfterApplyingOperationsOnTreeTest {
    private MaximumScoreAfterApplyingOperationsOnTree maximumScoreAfterApplyingOperationsOnTree;

    @BeforeEach
    void setup() {
        maximumScoreAfterApplyingOperationsOnTree = new MaximumScoreAfterApplyingOperationsOnTree();
    }

    private void test(long output, int[][] edges, int[] values) {
        Assertions.assertEquals(output,
                maximumScoreAfterApplyingOperationsOnTree.maximumScoreAfterOperations(edges, values));
    }

    @Test
    void test0() {
        test(40, new int[][] { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 1, 4 }, { 2, 5 }, { 2, 6 } },
                new int[] { 20, 10, 9, 7, 4, 3, 5 });
    }
}
