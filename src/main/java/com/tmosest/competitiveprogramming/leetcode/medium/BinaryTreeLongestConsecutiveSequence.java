package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class BinaryTreeLongestConsecutiveSequence {

  private int longestSequence;

  /**
   * Find the longest sequence ascending root to leaf path.
   * @param root The root of the tree.
   * @return The length of the longest ascending sequence.
   */
  public int longestConsecutive(TreeNode root) {
    longestSequence = 0;
    if (root == null) {
      return longestSequence;
    }
    longestConsecutive(root, root.val, longestSequence);
    return longestSequence;
  }

  private void longestConsecutive(TreeNode root, int prev, int length) {
    if (root == null) {
      longestSequence = Math.max(length, longestSequence);
      return;
    }
    if (root.val == prev + 1) {
      length++;
    } else {
      length = 1;
    }
    prev = root.val;
    longestSequence = Math.max(length, longestSequence);
    longestConsecutive(root.left, prev, length);
    longestConsecutive(root.right, prev, length);
  }
}
