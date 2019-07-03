package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class ConstructBinaryTreeFromString {

  private int idx;

  /**
   * Convert a string to a TreeNode.
   *
   * @param str The string.
   * @return The tree that this string represents.
   */
  TreeNode str2tree(String str) {
    int len = str.length();
    if (len == 0 || idx >= len) {
      return null;
    }
    int sig = 1;
    int temp = 0;
    if (str.charAt(idx) == '-') {
      sig = -1;
      ++idx;
    }
    while (idx < len && str.charAt(idx) >= '0' && str.charAt(idx) <= '9') {
      temp = temp * 10 + str.charAt(idx) - '0';
      ++idx;
    }
    TreeNode root = new TreeNode(sig * temp);
    if (idx >= len || str.charAt(idx) == ')') {
      ++idx;
      return root;
    }
    ++idx;
    root.left = str2tree(str);
    if (idx >= len || str.charAt(idx) == ')') {
      ++idx;
      return root;
    }
    ++idx;
    root.right = str2tree(str);
    if (idx >= len || str.charAt(idx) == ')') {
      ++idx;
      return root;
    }
    return root;
  }
}
