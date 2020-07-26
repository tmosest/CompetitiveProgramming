package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class NumberOfGoodLeafNodesPairs {

  private int res;

  int countPairs(TreeNode root, int distance) {
    res = 0;
    helper(root, distance);
    return res;
  }

  private int[] helper(TreeNode node, int distance) {

    if (node == null) {
      return new int[11];
    }

    int[] left = helper(node.left, distance);
    int[] right = helper(node.right, distance);

    int[] arr = new int[11];

    // node is leaf node, no child, just return
    if (node.left == null && node.right == null) {
      arr[1] = 1;
      return arr;
    }

    // find all nodes satisfying distance
    for (int i = 0; i <= 10; ++i) {
      for (int j = 0; j <= 10; ++j) {
        if (i + j <= distance) {
          res += (left[i] * right[j]);
        }
      }
    }

    // increment all by 1, ignore the node distance larger than 10
    for (int i = 0; i <= 9; ++i) {
      arr[i + 1] += left[i];
      arr[i + 1] += right[i];
    }

    return arr;
  }
}
