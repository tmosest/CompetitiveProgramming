package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinaryTreeRightSideView {

  /**
   * Determine what a binary tree would look like when looking from the right.
   *
   * @param root The root of the tree.
   * @return A list of the tree when viewed from the right.
   */
  List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        root = queue.poll();
        if (root.left != null) {
          queue.add(root.left);
        }
        if (root.right != null) {
          queue.add(root.right);
        }
        if (i == size - 1) {
          result.add(root.val);
        }
      }
    }
    return result;
  }
}
