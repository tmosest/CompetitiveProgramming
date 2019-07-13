package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 96. Unique Binary Search Trees")
class UniqueBinarySearchTreesTest {

  private UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(5, uniqueBinarySearchTrees.numTrees(3));
  }
}
