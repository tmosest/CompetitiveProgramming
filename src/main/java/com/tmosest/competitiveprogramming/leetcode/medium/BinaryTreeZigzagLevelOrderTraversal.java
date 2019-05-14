package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class BinaryTreeZigzagLevelOrderTraversal {
  /* Write code here. */

  /**
   * Level by level traversal with zigzagging.
   *
   * @param root The root of the tree.
   * @return A list of list of zigzagged levels.
   */
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();
    if (root == null) {
      return result;
    }
    LinkedList<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    boolean forwards = true;
    while (!queue.isEmpty()) {
      int size = queue.size();
      LinkedList<TreeNode> nextQueue = new LinkedList<>();
      List<Integer> row = new LinkedList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        if (node != null) {
          row.add(node.val);
          if (node.left != null) {
            nextQueue.add(node.left);
          }
          if (node.right != null) {
            nextQueue.add(node.right);
          }
        }
      }
      if (!forwards) {
        Collections.reverse(row);
      }
      result.add(row);
      queue = nextQueue;
      forwards = !forwards;
    }
    return result;
  }


}
