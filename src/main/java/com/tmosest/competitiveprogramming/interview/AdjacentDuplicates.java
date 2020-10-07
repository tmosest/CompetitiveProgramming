package com.tmosest.competitiveprogramming.interview;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class AdjacentDuplicates {

  /**
   * Determine the longest sequence of consecutive duplicate values in an array.
   * Example: [0,1,2,3,4] -> 1 and [1,1,1,1,0] -> 4
   * @param arr The array of numbers.
   * @return The the length of the longest sequence of consecutive numbers.
   */
  int longestSequence(int[] arr) {
    if (arr == null || arr.length < 1) {
      return 0;
    }

    int maxLength = 1;
    int count = 1;
    int prev = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == prev) {
        ++count;
        maxLength = Math.max(count, maxLength);
      } else {
        count = 1;
        prev = arr[i];
      }
    }

    return maxLength;
  }

  private int maxLength;

  /*
    TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
    }
  */

  /**
   * Determine the longest sequence of consecutive duplicate values in a binary tree.
   * Example: [0,1,2,3,4] -> 1 and [1,1,3,4] -> 2
   * @param treeNode The root of the tree.
   * @return The the length of the longest sequence of consecutive numbers.
   */
  int longestSequence(TreeNode treeNode) {
    if (treeNode == null) {
      return 0;
    }

    maxLength = 1;
    longestSequenceHelper(treeNode);
    return maxLength;
  }

  private int longestSequenceHelper(TreeNode treeNode) {
    if (treeNode == null) {
      return 0;
    }

    int left = 1;
    int right = 1;

    if (treeNode.left != null) {
      int leftLocal = longestSequenceHelper(treeNode.left);
      if (treeNode.left.val == treeNode.val) {
        left = leftLocal + 1;
      }
    }

    if (treeNode.right != null && treeNode.right.val == treeNode.val) {
      int rightLocal = longestSequenceHelper(treeNode.right);
      if (treeNode.right.val == treeNode.val) {
        right = rightLocal + 1;
      }
    }

    int max = Math.max(left, right);
    maxLength = Math.max(maxLength, max);

    return max;
  }
}
