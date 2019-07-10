package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 450. Delete Node in a BST")
class DeleteNodeInBstTest {

  private Codec code = new Codec();
  private DeleteNodeInBst deleteNodeInBst = new DeleteNodeInBst();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = code.deserialize("[5,3,6,2,4,null,7]");
    deleteNodeInBst.deleteNode(root, 3);
  }
}
