package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 156. Binary Tree Upside Down")
class BinaryTreeUpsideDownTest {

  private BinaryTreeUpsideDown binaryTreeUpsideDown = new BinaryTreeUpsideDown();
  private Codec codec = new Codec();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String input = "[1,2,3,4,5]";
    String expected = "[4,5,2,null,null,3,1]";
    String actual = codec.serialize(binaryTreeUpsideDown.upsideDownBinaryTree(codec.deserialize(input)));
    Assertions.assertEquals(expected, actual);
  }
}
