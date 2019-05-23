package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class BinaryTreeLongestConsecutiveSequenceTwo {

  private int maxLength;

  /**
   * Determine the longest consecutive sequence.
   * @param root The root of the sequence.
   * @return The length.
   */
  public int longestConsecutive(TreeNode root) {
    if (root == null) {
      return 0;
    }
    longestPath(root);
    return maxLength;
  }

  private int[] longestPath(TreeNode root) {
    if (root == null) {
      return new int[] {0, 0};
    }
    int inr = 1;
    int dcr = 1;
    if (root.left != null) {
      int[] left = longestPath(root.left);
      if (root.val == root.left.val + 1) {
        dcr = left[1] + 1;
      } else if (root.val == root.left.val - 1) {
        inr = left[0] + 1;
      }
    }
    if (root.right != null) {
      int[] right = longestPath(root.right);
      if (root.val == root.right.val + 1) {
        dcr = Math.max(dcr, right[1] + 1);
      } else if (root.val == root.right.val - 1) {
        inr = Math.max(inr, right[0] + 1);
      }
    }
    maxLength = Math.max(maxLength, dcr + inr - 1);
    return new int[] {inr, dcr};
  }
}
