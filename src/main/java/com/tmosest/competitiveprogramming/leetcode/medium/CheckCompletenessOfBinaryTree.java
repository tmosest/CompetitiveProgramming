package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

class CheckCompletenessOfBinaryTree {

  /**
   * Determine if a binary tree is complete or not.
   *
   * @param root The root of the tree.
   * @return True if it is complete and false otherwise.
   */
  boolean isCompleteTree(TreeNode root) {

    List<Pair> nodes = new LinkedList<>();
    nodes.add(new Pair(root, 1));

    int index = 0;
    while (index < nodes.size()) {
      Pair pair = nodes.get(index++);
      if (pair.node != null) {
        nodes.add(new Pair(pair.node.left, pair.pos * 2));
        nodes.add(new Pair(pair.node.right, pair.pos * 2 + 1));
      }
    }

    return nodes.get(index - 1).pos == nodes.size();
  }

  private static class Pair {

    private TreeNode node;
    private int pos;

    private Pair(TreeNode node, int pos) {
      this.node = node;
      this.pos = pos;
    }
  }
}
