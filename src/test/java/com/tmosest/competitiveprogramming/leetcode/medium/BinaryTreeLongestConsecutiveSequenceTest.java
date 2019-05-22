package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import com.tmosest.competitiveprogramming.leetcode.medium.Codec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 298. Binary Tree Longest Consecutive Sequence ")
class BinaryTreeLongestConsecutiveSequenceTest {

  private Codec codec = new Codec();
  private BinaryTreeLongestConsecutiveSequence binaryTreeLongestConsecutiveSequence =
      new BinaryTreeLongestConsecutiveSequence();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String tree = "[1,null,3,2,4,null,null,null,5]";
    TreeNode root = codec.deserialize(tree);
    Assertions.assertEquals(3, binaryTreeLongestConsecutiveSequence.longestConsecutive(root));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    String tree = "[]";
    TreeNode root = codec.deserialize(tree);
    Assertions.assertEquals(0, binaryTreeLongestConsecutiveSequence.longestConsecutive(root));
  }


}
