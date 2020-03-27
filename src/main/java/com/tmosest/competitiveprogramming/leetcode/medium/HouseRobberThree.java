package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class HouseRobberThree {

  int rob(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int[] res = postOrder(root);
    return Math.max(res[0], res[1]);
  }

  private int[] postOrder(TreeNode node) {
    if (node == null) {
      return new int[2];
    }
    int[] left = postOrder(node.left);
    int[] right = postOrder(node.right);

    int with = node.val + left[1] + right[1];
    int without = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

    return new int[]{with, without};
  }
}
