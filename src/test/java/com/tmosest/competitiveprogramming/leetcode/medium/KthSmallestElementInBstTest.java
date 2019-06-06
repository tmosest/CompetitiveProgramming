package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 230. Kth Smallest Element in a BST")
class KthSmallestElementInBstTest {

  private KthSmallestElementInBst kthSmallestElementInBst = new KthSmallestElementInBst();
  private Codec codec = new Codec();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = codec.deserialize("[3,1,4,null,2]");
    Assertions.assertEquals(1, kthSmallestElementInBst.kthSmallest(root, 1));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    TreeNode root = codec.deserialize("[5,3,6,2,4,null,null,1]");
    Assertions.assertEquals(3, kthSmallestElementInBst.kthSmallest(root, 3));
  }
}
