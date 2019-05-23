package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 549. Binary Tree Longest Consecutive Sequence II")
class BinaryTreeLongestConsecutiveSequenceTwoTest {

  private Codec codec = new Codec();
  private BinaryTreeLongestConsecutiveSequenceTwo binaryTreeLongestConsecutiveSequenceTwo =
      new BinaryTreeLongestConsecutiveSequenceTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String tree = "[1,2,3,4]";
    Assertions.assertEquals(2,
        binaryTreeLongestConsecutiveSequenceTwo.longestConsecutive(
            codec.deserialize(tree)
        )
    );
  }
}
