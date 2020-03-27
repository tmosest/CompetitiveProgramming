package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class FindBottomLeftTreeValue {

  int findBottomLeftValue(TreeNode root) {

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode first = null;

      int size = queue.size();
      for (int i = 0; i < size; i++) {

        TreeNode node = queue.poll();
        if (first == null) {
          first = node;
        }

        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }

      if (queue.isEmpty()) {
        return first.val;
      }
    }

    return -1;
  }
}
