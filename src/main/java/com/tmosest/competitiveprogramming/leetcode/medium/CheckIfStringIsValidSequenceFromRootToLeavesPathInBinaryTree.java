package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class CheckIfStringIsValidSequenceFromRootToLeavesPathInBinaryTree {

  private boolean isValidSequence;
  private int[] arr;

  boolean isValidSequence(TreeNode root, int[] arr) {
    isValidSequence = false;
    this.arr = arr;
    isValidSequence(root, 0);
    return isValidSequence;
  }

  private void isValidSequence(TreeNode root, int index) {
    if (root == null || index >= arr.length || root.val != arr[index]) {
      return;
    }

    if (root.left == null && root.right == null && index == arr.length - 1) {
      isValidSequence = true;
      return;
    }

    isValidSequence(root.left, index + 1);
    isValidSequence(root.right, index + 1);
  }
}
