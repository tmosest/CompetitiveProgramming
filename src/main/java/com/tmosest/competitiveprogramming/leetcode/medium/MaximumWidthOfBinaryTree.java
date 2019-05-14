package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MaximumWidthOfBinaryTree {
  /* Write code here. */

  private List<List<Integer>> levels;

  /**
   * Determine the max width of a binary tree.
   *
   * @param root The root node of the tree.
   * @return The max width of any level.
   */
  int widthOfBinaryTree(TreeNode root) {
    levels = new ArrayList<>();
    widthOfBinaryTree(root, 1, 0);
    int max = 0;
    for (List<Integer> level : levels) {
      Collections.sort(level);
      max = Math.max(level.get(level.size() - 1) - level.get(0), max);
    }
    return max;
  }

  private void widthOfBinaryTree(TreeNode root, int level, int distance) {
    if (root == null) {
      return;
    }
    if (level > levels.size()) {
      for (int i = levels.size(); i < level; i++) {
        levels.add(new ArrayList<>());
      }
    }
    List<Integer> levelValues = levels.get(level - 1);
    levelValues.add(distance);
    widthOfBinaryTree(root.left, level + 1, distance - 1);
    widthOfBinaryTree(root.right, level + 1, distance + 1);
  }


}
