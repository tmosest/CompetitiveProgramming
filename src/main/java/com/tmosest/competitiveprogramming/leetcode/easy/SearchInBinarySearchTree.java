package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class SearchInBinarySearchTree {

  TreeNode searchBst(TreeNode root, int val) {
    while (root != null) {
      if (root.val == val) {
        return root;
      } else if (root.val > val) {
        root = root.left;
      } else {
        root = root.right;
      }
    }
    return null;
  }
}
