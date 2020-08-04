package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("wc174")
@DisplayName("LeetCode: 1339. Maximum Product of Splitted Binary Tree")
class MaximumProductOfSplittedBinaryTreeTest {

  private Codec codec = new Codec();
  private MaximumProductOfSplittedBinaryTree maximumProductOfSplittedBinaryTree =
      new MaximumProductOfSplittedBinaryTree();

  private void test(String input, int output) {
    Assertions.assertEquals(output, maximumProductOfSplittedBinaryTree.maxProduct(codec.deserialize(
        input
    )));
  }

  @Test
  void testCase0() {
    test("[1,2,3,4,5,6]", 110);
  }
}
