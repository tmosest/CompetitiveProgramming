package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1104. Path In Zigzag Labelled Binary Tree")
class PathInZigzagLabelledBinaryTreeTest {

  private PathInZigzagLabelledBinaryTree pathInZigzagLabelledBinaryTree = new PathInZigzagLabelledBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[] expected = {
        1,3,4,14
    };
    Assertions.assertEquals(Arrays.asList(expected), pathInZigzagLabelledBinaryTree.pathInZigZagTree(14));
  }
}
