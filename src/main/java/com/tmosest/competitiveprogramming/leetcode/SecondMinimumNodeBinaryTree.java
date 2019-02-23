package com.tmosest.competitiveprogramming.leetcode;

import java.util.PriorityQueue;

public class SecondMinimumNodeBinaryTree {

  PriorityQueue<Integer> priorityQueue;

  /**
   * Find the second smallest element in a binary tree.
   * @param root The root element.
   * @return The second smallest element.
   */
  public int findSecondMinimumValue(TreeNode root) {
    priorityQueue = new PriorityQueue<>();
    addToQueue(root);
    priorityQueue.poll();
    return priorityQueue.poll();
  }

  private void addToQueue(TreeNode root) {
    if (root == null) {
      return;
    }
    priorityQueue.add(root.val);
    addToQueue(root.left);
    addToQueue(root.right);
  }
}
