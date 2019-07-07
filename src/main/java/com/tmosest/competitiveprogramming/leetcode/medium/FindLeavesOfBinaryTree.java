package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FindLeavesOfBinaryTree {

  private List<List<Integer>> levels = new ArrayList<>();

  /**
   * Return the leaves.
   *
   * @param root Thee root of the tree.
   * @return List of list of leaves removed.
   */
  List<List<Integer>> findLeaves(TreeNode root) {
    levels = new ArrayList<>();
    addNodes(root);
    Collections.reverse(levels);
    return levels;
  }

  private int addNodes(TreeNode root) {

    if (root == null) {
      return 0;
    }

    int left = addNodes(root.left);
    int right = addNodes(root.right);
    int depth = Math.max(left, right) + 1;

    while (levels.size() < depth) {
      levels.add(new ArrayList<>());
    }

    List<Integer> level = levels.get(depth - 1);

    level.add(root.val);

    return depth;
  }
}
