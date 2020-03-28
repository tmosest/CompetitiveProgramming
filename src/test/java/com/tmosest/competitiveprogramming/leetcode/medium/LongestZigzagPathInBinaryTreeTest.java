package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@Tag("binaryTree")
@DisplayName("LeetCode: 1372. Longest ZigZag Path in a Binary Tree")
class LongestZigzagPathInBinaryTreeTest {

  private Codec codec = new Codec();
  private LongestZigzagPathInBinaryTree longestZigzagPathInBinaryTree =
      new LongestZigzagPathInBinaryTree();

  @Test
  void testCase0() {
    Assertions.assertEquals(3, longestZigzagPathInBinaryTree.longestZigZag(
        codec.deserialize("[1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]")
    ));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(4, longestZigzagPathInBinaryTree.longestZigZag(
        codec.deserialize("[1,1,1,null,1,null,null,1,1,null,1]")
    ));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(0, longestZigzagPathInBinaryTree.longestZigZag(
        codec.deserialize("[1]")
    ));
  }
}
