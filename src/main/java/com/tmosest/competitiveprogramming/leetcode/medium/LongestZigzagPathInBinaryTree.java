package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class LongestZigzagPathInBinaryTree {

  private int longest;

  int longestZigZag(TreeNode root) {

    longest = 0;

    if (root == null || (root.left == null && root.right == null)) {
      return longest;
    }

    helper(root);

    return longest;
  }

  private int[] helper(TreeNode root) {

    int[] res = new int[]{0, 0};

    if (root == null || (root.left == null && root.right == null)) {
      return res;
    }

    if (root.left != null) {
      int[] left = helper(root.left);
      res[0] = left[1] + 1;
    }

    if (root.right != null) {
      int[] right = helper(root.right);
      res[1] = right[0] + 1;
    }

    int max = Math.max(res[0], res[1]);
    longest = Math.max(max, longest);

    return res;
  }
}
