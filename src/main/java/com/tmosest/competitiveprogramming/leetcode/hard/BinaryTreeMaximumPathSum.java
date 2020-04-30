package com.tmosest.competitiveprogramming.leetcode.hard;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class BinaryTreeMaximumPathSum {

  private int maxSum;

  int maxPathSum(TreeNode root) {
    maxSum = Integer.MIN_VALUE;
    maxGain(root);
    return maxSum;
  }

  private int maxGain(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int leftGain = Math.max(maxGain(root.left), 0);
    int rightGain = Math.max(maxGain(root.right), 0);
    int sum = root.val + leftGain + rightGain;
    maxSum = Math.max(maxSum, sum);
    return root.val + Math.max(leftGain, rightGain);
  }
}
