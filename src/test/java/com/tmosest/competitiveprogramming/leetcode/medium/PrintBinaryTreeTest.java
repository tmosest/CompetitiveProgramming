package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 655. Print Binary Tree")
class PrintBinaryTreeTest {

  private Codec codec = new Codec();
  private PrintBinaryTree printBinaryTree = new PrintBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String data = "[1,2]";
    printBinaryTree.printTree(codec.deserialize(data));
  }
}
