package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@Tag("wc190")
@DisplayName("LeetCode: 1457. Pseudo-Palindromic Paths in a Binary Tree")
class PseudopalindromicPathsInBinaryTreeTest {

  private Codec codec = new Codec();
  private PseudopalindromicPathsInBinaryTree pseudopalindromicPathsInBinaryTree =
      new PseudopalindromicPathsInBinaryTree();

  @Test
  void testCase0() {
    Assertions.assertEquals(2, pseudopalindromicPathsInBinaryTree.pseudoPalindromicPaths(
        codec.deserialize("[2,3,1,3,1,null,1]")
    ));
  }
}
