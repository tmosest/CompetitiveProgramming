package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.Stack;

public class Codec {

  /**
   * Serializes the binary tree.
   * @param root The root node.
   * @return The string representation of it.
   */
  public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    serialize(root, sb);
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }

  private void serialize(TreeNode root, StringBuilder sb) {
    if (root == null) {
      sb.append("null,");
      return;
    }
    sb.append(root.val);
    sb.append(",");
    serialize(root.left, sb);
    serialize(root.right, sb);
  }

  /**
   * Deserialize the string back into an object.
   * @param data The string.
   * @return The root of the tree that the string represents.
   */
  public TreeNode deserialize(String data) {
    if (data.equals("null")) {
      return null;
    }
    String[] array = data.split(",");
    TreeNode root = new TreeNode(Integer.valueOf(array[0]));
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    deserialize(array, 1, stack, true);
    return root;
  }

  private void deserialize(String[] data, int index, Stack<TreeNode> stack, boolean isLeft) {
    if (index >= data.length) {
      return;
    }
    boolean isNull = data[index].equals("null");
    if (isNull && isLeft) {
      deserialize(data, index + 1, stack, false);
      return;
    }
    if (isNull && !isLeft) {
      stack.pop();
      deserialize(data, index + 1, stack, false);
      return;
    }
    Integer val = Integer.valueOf(data[index]);
    TreeNode root = stack.peek();
    if (isLeft) {
      root.left = new TreeNode(val);
      stack.push(root.left);
      deserialize(data, index + 1, stack, true);
      return;
    }
    root.right = new TreeNode(val);
    stack.push(root.right);
    deserialize(data, index + 1, stack, false);
  }
}
