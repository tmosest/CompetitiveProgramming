package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import com.tmosest.competitiveprogramming.leetcode.medium.Codec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binarySearchTree")
@DisplayName("LeetCode: 530. Minimum Absolute Difference in BST")
class MinimumAbsoluteDifferenceInBstTest {

  private Codec codec = new Codec();
  private MinimumAbsoluteDifferenceInBst minimumAbsoluteDifferenceInBst = new MinimumAbsoluteDifferenceInBst();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = codec.deserialize("[1,null,3,2,null]");
    Assertions.assertEquals(1, minimumAbsoluteDifferenceInBst.getMinimumDifference(root));
  }
}
