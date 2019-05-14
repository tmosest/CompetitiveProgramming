package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class NaryTreeLevelOrderTraversal {
  /* Write code here. */

  /**
   * Level Order Traversal of a N-Ary Tree.
   *
   * @param root The root node of the tree.
   * @return A List of List of level values.
   */
  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    LinkedList<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      List<Integer> row = new ArrayList<>();
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        root = queue.poll();
        row.add(root.val);
        if (root.children != null) {
          for (Node child : root.children) {
            queue.add(child);
          }
        }
      }
      result.add(row);
    }

    return result;
  }


}
