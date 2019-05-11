package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("binaryTree")
@DisplayName("LeetCode: 437. Path Sum III")
public class PathSumThreeTest {
  PathSumThree pathSumThree = new PathSumThree();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(-3);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(2);
    root.right.right = new TreeNode(11);
    root.left.left.left = new TreeNode(3);
    root.left.left.right = new TreeNode(-2);
    root.left.right.right = new TreeNode(1);

    Assertions.assertEquals(3, pathSumThree.pathSum(root, 8));
  }
}
