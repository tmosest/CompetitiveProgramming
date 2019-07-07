package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 366. Find Leaves of Binary Tree")
class FindLeavesOfBinaryTreeTest {

  private Codec codec = new Codec();
  private FindLeavesOfBinaryTree findLeavesOfBinaryTree = new FindLeavesOfBinaryTree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = codec.deserialize("[1,2,3,4,5]");
    List<List<Integer>> actual = findLeavesOfBinaryTree.findLeaves(root);
    Assertions.assertEquals(3, actual.size());
    Assertions.assertEquals(1, actual.get(0).size());
  }
}
