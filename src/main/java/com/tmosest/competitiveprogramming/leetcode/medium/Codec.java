package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Codec {

  /**
   * Serializes the binary tree.
   *
   * @param root The root node.
   * @return The string representation of it.
   */
  public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    sb.append("[");

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int nonNullCount = (root != null) ? 1 : 0;
    while (!queue.isEmpty() && nonNullCount != 0) {
      for (int i = 0, size = queue.size(); i < size; i++) {
        root = queue.poll();
        if (root == null) {
          sb.append("null");
          queue.add(null);
          queue.add(null);
        } else {
          sb.append(root.val);
          nonNullCount--;
          if (root.left != null) {
            nonNullCount++;
          }
          if (root.right != null) {
            nonNullCount++;
          }
          queue.add(root.left);
          queue.add(root.right);
        }
        sb.append(",");
      }
    }
    sb.deleteCharAt(sb.length() - 1);
    sb.append("]");
    return sb.toString();
  }

  /**
   * Deserialize the string back into an object.
   *
   * @param data The string.
   * @return The root of the tree that the string represents.
   */
  public TreeNode deserialize(String data) {
    if (data.equals("null")) {
      return null;
    }
    data = data
        .replace("[", "")
        .replace("]", "");
    String[] array = data.split(",");
    ArrayList<TreeNode> nodes = new ArrayList<>();
    nodes.add(new TreeNode(-1));
    for (String val : array) {
      try {
        nodes.add(new TreeNode(Integer.valueOf(val)));
      } catch (Exception exception) {
        nodes.add(null);
      }
    }
    int childIndex = 2;
    for (int i = 1, size = nodes.size(); i < size; i++) {
      TreeNode node = nodes.get(i);
      if (node == null) {
        continue;
      }
      if (childIndex < size) {
        node.left = nodes.get(childIndex);
        childIndex++;
      }
      if (childIndex < size) {
        node.right = nodes.get(childIndex);
        childIndex++;
      }
    }
    return nodes.get(1);
  }
}
