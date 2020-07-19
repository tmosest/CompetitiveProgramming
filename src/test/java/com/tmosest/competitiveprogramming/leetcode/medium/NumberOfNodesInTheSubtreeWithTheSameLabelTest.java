package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("wc198")
@DisplayName("LeetCode: 1519. Number of Nodes in the Sub-Tree With the Same Label")
class NumberOfNodesInTheSubtreeWithTheSameLabelTest {

  private NumberOfNodesInTheSubtreeWithTheSameLabel numberOfNodesInTheSubtreeWithTheSameLabel = new NumberOfNodesInTheSubtreeWithTheSameLabel();

  private void test(int num, int[][] edges, String label, int[] ouput) {
    Assertions.assertArrayEquals(ouput,
        numberOfNodesInTheSubtreeWithTheSameLabel.countSubTrees(num, edges, label));
  }

  @Test
  void testCase0() {
    test(7, new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, "abaedcd",
        new int[]{2, 1, 1, 1, 1, 1, 1});
  }
}
