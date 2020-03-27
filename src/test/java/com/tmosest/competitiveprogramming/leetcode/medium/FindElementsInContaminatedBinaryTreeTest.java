package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 1261. Find Elements in a Contaminated Binary Tree")
class FindElementsInContaminatedBinaryTreeTest {

  private Codec codec = new Codec();
  private FindElementsInContaminatedBinaryTree findElementsInContaminatedBinaryTree;

  @Test
  void testCase0() {
    findElementsInContaminatedBinaryTree = new FindElementsInContaminatedBinaryTree(
        codec.deserialize("[-1,null,-1]")
    );
    Assertions.assertFalse(findElementsInContaminatedBinaryTree.find(1));
    Assertions.assertTrue(findElementsInContaminatedBinaryTree.find(2));
  }
}
