package com.tmosest.competitiveprogramming.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  /**
   * Create a new tree node with a given value.
   * @param val The value to set the node to.
   */
  public TreeNode(int val) {
    this.val = val;
  }

  /**
   * Determines if two trees are equals.
   * @param root The other tree.
   * @return True if they are equal and false otherwise.
   */
  public boolean equals(TreeNode root) {
    return TreeNodeAdapter
        .convertToUtility(this)
        .equals(TreeNodeAdapter.convertToUtility(root));
  }

  public static TreeNode fromString(String str) {
    String[] array = str.replace("[", "").replace("]", "").split(",");
    
    List<TreeNode> nodes = new ArrayList<>();

    for (String local : array) {
      nodes.add(new TreeNode(Integer.parseInt(local.trim())));
    }

    for (int i = 0; i < nodes.size(); i++) {
      TreeNode node = nodes.get(i);
      if (i * 2 + 1 < nodes.size()) {
        node.left = nodes.get(i * 2 + 1);
      }
      if (i * 2 + 2 < nodes.size()) {
        node.right = nodes.get(i * 2 + 2);
      }
    }

    return nodes.get(0);
  }
}
