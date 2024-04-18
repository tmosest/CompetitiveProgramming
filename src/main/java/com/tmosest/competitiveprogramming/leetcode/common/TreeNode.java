package com.tmosest.competitiveprogramming.leetcode.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
      if (local.equals("null")) {
        nodes.add(null);
        continue;
      }
      nodes.add(new TreeNode(Integer.parseInt(local.trim())));
    }

    for (int i = 0; i < nodes.size(); i++) {
      TreeNode node = nodes.get(i);
      if (node == null) {
        continue;
      }
      if (i * 2 + 1 < nodes.size()) {
        node.left = nodes.get(i * 2 + 1);
      }
      if (i * 2 + 2 < nodes.size()) {
        node.right = nodes.get(i * 2 + 2);
      }
    }

    return nodes.get(0);
  }

  public String toString() {
    List<Integer> list = toList();
    
    StringBuilder stringBuilder = new StringBuilder();

    for (Integer num : list) {
      if (num == null) {
        stringBuilder.append("null,");
        continue;
      }
      stringBuilder.append(num);
      stringBuilder.append(",");
    }

    if (stringBuilder.length() > 0) {
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    }

    return stringBuilder.toString();
  }

  public List<Integer> toList() {
    List<Integer> list = new ArrayList<>();

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(this);

    while(!queue.isEmpty()) {
      TreeNode current = queue.poll();
      if (current == null) {
        list.add(null);
        continue;
      }
      list.add(current.val);
      queue.add(current.left);
      queue.add(current.right);
    }

    return list;
  }
}
