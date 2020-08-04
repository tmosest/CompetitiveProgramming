package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class MaximumProductOfSplittedBinaryTree {

  private long max;

  int maxProduct(TreeNode root) {
    max = Long.MIN_VALUE;
    maxProductHelper(root, sum(root));
    return (int) (max % 1000000007);
  }

  private int sum(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return sum(root.left) + sum(root.right) + root.val;
  }

  private int maxProductHelper(TreeNode root, long totalSum) {

    if (root == null) {
      return 0;
    }

    int sum = maxProductHelper(root.left, totalSum)
        + maxProductHelper(root.right, totalSum) + root.val;
    long product = (long) sum * (totalSum - sum);
    max = Math.max(max, product);

    return sum;
  }
}
