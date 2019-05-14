package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 103. Binary Tree Zigzag Level Order Traversal")
class BinaryTreeZigzagLevelOrderTraversalTest {
	/* Write code here. */

  BinaryTreeZigzagLevelOrderTraversal binaryTreeZigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.right = new TreeNode(7);
    root.right.left = new TreeNode(15);

    List<List<Integer>> expected = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    row.add(3);
    expected.add(row);
    row = new ArrayList<>();
    row.add(20);
    row.add(9);
    expected.add(row);
    row = new ArrayList<>();
    row.add(15);
    row.add(7);
    expected.add(row);

    List<List<Integer>> actual = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      List<Integer> expectedList = expected.get(i);
      List<Integer> actualList = actual.get(i);
      Assertions.assertEquals(expectedList.size(), actualList.size());
      for (int j = 0; j < expectedList.size(); j++) {
        Assertions.assertEquals(expectedList.get(j), actualList.get(j));
      }
    }
  }


}
