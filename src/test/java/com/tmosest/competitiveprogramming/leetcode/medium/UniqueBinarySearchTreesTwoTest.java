package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 95. Unique Binary Search Trees II")
class UniqueBinarySearchTreesTwoTest {

  private UniqueBinarySearchTreesTwo uniqueBinarySearchTreesTwo =
      new UniqueBinarySearchTreesTwo();

  @Test
  void testCase0() {
    Assertions.assertEquals(5, uniqueBinarySearchTreesTwo.generateTrees(3).size());
  }
}
