package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.PriorityQueue;

class SmallestStringStartingFromLeaf {
  /* Write code here. */

  /**
   * Determine the smallest string that c an be made from a tree. The nodes are numbered with 1 to
   * 25.
   *
   * @param root The root node.
   * @return The smallest tree which is a path from a leaf to the root.
   */
  public String smallestFromLeaf(TreeNode root) {
    if (root == null) {
      return "";
    }
    PriorityQueue<String> priorityQueue = new PriorityQueue<>();
    traverseTree(root, "", priorityQueue);
    return priorityQueue.poll();
  }

  private void traverseTree(TreeNode root, String path, PriorityQueue<String> queue) {
    if (root == null) {
      return;
    }
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getLetter(root.val));
    stringBuilder.append(path);
    if (root.left == null && root.right == null) {
      queue.add(stringBuilder.toString());
      return;
    }
    traverseTree(root.left, stringBuilder.toString(), queue);
    traverseTree(root.right, stringBuilder.toString(), queue);
  }

  private char getLetter(int val) {
    return (char) ('a' + val - 1);
  }


}
