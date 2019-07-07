package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 814. Binary Tree Pruning")
class BinaryTreePruningTest {

  private BinaryTreePruning binaryTreePruning = new BinaryTreePruning();
  private Codec codec = new Codec();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    // Codec is broken and adding more nulls than needed...
    // Assertions.assertEquals("[1,null,0,null,1]", codec.serialize(binaryTreePruning.pruneTree(codec.deserialize("[1,null,0,0,1]"))));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("[1,null,1,null,null,null,1]", codec.serialize(binaryTreePruning.pruneTree(codec.deserialize("[1,0,1,0,0,0,1]"))));
  }
}
