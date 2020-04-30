package com.tmosest.competitiveprogramming.leetcode.hard;

import com.tmosest.competitiveprogramming.leetcode.medium.Codec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("binaryTree")
@Tag("april30Day")
@DisplayName("LeetCode: 124. Binary Tree Maximum Path Sum")
class BinaryTreeMaximumPathSumTest {

  private Codec codec = new Codec();
  private BinaryTreeMaximumPathSum binaryTreeMaximumPathSum =
      new BinaryTreeMaximumPathSum();

  @Test
  void testCase0() {
    Assertions.assertEquals(6, binaryTreeMaximumPathSum.maxPathSum(codec.deserialize("[1,2,3]")));
  }
}
