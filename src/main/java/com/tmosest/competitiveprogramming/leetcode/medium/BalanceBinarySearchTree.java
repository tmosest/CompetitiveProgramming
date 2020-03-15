package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class BalanceBinarySearchTree {

  TreeNode balanceBst(TreeNode root) {
    List<TreeNode> nodes = new ArrayList<>();
    store(root, nodes);
    return buildTreeUtil(nodes, 0, nodes.size() - 1);
  }

  private void store(TreeNode root, List<TreeNode> nodes) {
    if (root == null) {
      return;
    }
    store(root.left, nodes);
    nodes.add(root);
    store(root.right, nodes);
  }

  private TreeNode buildTreeUtil(
      List<TreeNode> nodes,
      int start,
      int end
  ) {

    if (start > end) {
      return null;
    }

    int mid = (start + end) / 2;
    TreeNode node = nodes.get(mid);

    node.left = buildTreeUtil(nodes, start, mid - 1);
    node.right = buildTreeUtil(nodes, mid + 1, end);

    return node;
  }
}
