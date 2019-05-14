package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class CousinsInBinaryTree {
  private Map<Integer, Integer> depth;
  private Map<Integer, TreeNode> parent;

  /**
   * Determine if nodes are cousins.
   * @param root The root of the tree.
   * @param left Left index.
   * @param right Right index.
   * @return True if they are cousins.
   */
  public boolean isCousins(TreeNode root, int left, int right) {
    depth = new HashMap<>();
    parent = new HashMap<>();
    dfs(root, null);
    return (depth.get(left) == depth.get(right) && parent.get(left) != parent.get(right));
  }

  private void dfs(TreeNode node, TreeNode par) {
    if (node != null) {
      depth.put(node.val, par != null ? 1 + depth.get(par.val) : 0);
      parent.put(node.val, par);
      dfs(node.left, node);
      dfs(node.right, node);
    }
  }
}
