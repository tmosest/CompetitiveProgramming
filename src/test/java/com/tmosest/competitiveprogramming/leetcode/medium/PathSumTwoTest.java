package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("binaryTree")
@DisplayName("LeetCode: 113. Path Sum II")
class PathSumTwoTest {
	/* Write code here. */

  PathSumTwo pathSumTwo = new PathSumTwo();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.right = new TreeNode(8);
    root.left.left = new TreeNode(11);
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(4);
    root.left.left.left = new TreeNode(7);
    root.left.left.right = new TreeNode(2);
    root.right.right.left = new TreeNode(5);
    root.right.right.right = new TreeNode(1);
    int expectedSum = 22;
    List<List<Integer>> actual = pathSumTwo.pathSum(root, expectedSum);
    Assertions.assertEquals(2, actual.size());
    for (List<Integer> list : actual) {
      int sum = 0;
      for (Integer i : list) {
        sum += i;
      }
      Assertions.assertEquals(expectedSum, sum);
    }
  }


}
