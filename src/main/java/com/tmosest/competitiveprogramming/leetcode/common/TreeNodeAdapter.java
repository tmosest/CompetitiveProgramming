package com.tmosest.competitiveprogramming.leetcode.common;

import com.tmosest.competitiveprogramming.utils.tree.UtilTreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Class for converting TreeNode to UtilTreeNode.
 */
public class TreeNodeAdapter {

  private static Map<TreeNode, UtilTreeNode<Integer>> viewedUtilTreeNodes = new HashMap<>();

  /**
   * Converts leetcode UtilTrieNode to a utility format.
   *
   * @param treeNode The LeetCode UtilTrieNode.
   * @return A UtilityTreeNode.
   */
  public static UtilTreeNode<Integer> convertToUtility(TreeNode treeNode) {
    viewedTreeNodes.clear(); // Clear the set
    return convertToUtilityHelper(treeNode);
  }

  private static UtilTreeNode<Integer> convertToUtilityHelper(TreeNode treeNode) {
    // Null check and loop check.
    if (treeNode == null || viewedUtilTreeNodes.containsKey(treeNode)) {
      return viewedUtilTreeNodes.get(treeNode);
    }
    UtilTreeNode<Integer> result = new UtilTreeNode<>(treeNode.val);
    // Use recursion to fill in left sub-tree.
    if (treeNode.left != null) {
      result.left = convertToUtilityHelper(treeNode.left);
    }
    // Use recursion to fill in the right sub-tree.
    if (treeNode.right != null) {
      result.right = convertToUtilityHelper(treeNode.right);
    }
    // Return the root of tree.
    return result;
  }

  private static Map<UtilTreeNode<Integer>, TreeNode> viewedTreeNodes = new HashMap<>();

  /**
   * Convert to a TreeNode. It was originally designed to only covert a real tree but supports
   * circuits now.
   *
   * @param treeNode The root of the util tree.
   * @return The root of the tree node.
   */
  public static TreeNode convertToTreeNode(UtilTreeNode<Integer> treeNode) {
    viewedTreeNodes.clear(); // Clear the set
    return convertToTreeNodeHelper(treeNode); // Convert to Tree Node recursively.
  }

  private static TreeNode convertToTreeNodeHelper(UtilTreeNode<Integer> treeNode) {
    // Null check and loop check.
    if (treeNode == null || viewedTreeNodes.containsKey(treeNode)) {
      return viewedTreeNodes.get(treeNode);
    }
    TreeNode result = new TreeNode(treeNode.val);
    viewedTreeNodes.put(treeNode, result);
    // Use recursion to fill in left sub-tree.
    if (treeNode.left != null) {
      result.left = convertToTreeNodeHelper(treeNode.left);
    }
    // Use recursion to fill in the right sub-tree.
    if (treeNode.right != null) {
      result.right = convertToTreeNodeHelper(treeNode.right);
    }
    // Return the root of tree.
    return result;
  }
}
