package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

  /**
   * Function to get all the paths from a root to leaf as strings.
   * @param root The root node of the binary tree.
   * @return A List of all the paths as strings.
   */
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new ArrayList<>();
    helper(root, "", result);
    return result;
  }

  private void helper(TreeNode node, String path, List<String> list) {
    if (node == null) {
      return;
    }
    if (!"".equals(path)) {
      path += "->";
    }
    path += node.val;
    if (node.left == null && node.right == null) {
      list.add(path);
      return;
    }
    helper(node.left, path, list);
    helper(node.right, path, list);
  }
}
