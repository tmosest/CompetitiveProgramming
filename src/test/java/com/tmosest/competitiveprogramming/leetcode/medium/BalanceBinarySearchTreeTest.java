package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("wc180")
@DisplayName("LeetCode: 5179. Balance a Binary Search Tree")
class BalanceBinarySearchTreeTest {

  private BalanceBinarySearchTree balanceBinarySearchTree =
      new BalanceBinarySearchTree();

  @Test
  void testCase0() {
    Assertions.assertNull(balanceBinarySearchTree.balanceBst(null));
  }
}
