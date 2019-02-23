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
    if (priorityQueue.size() < 2) {
      return -1;
    }
    int smallest = priorityQueue.poll();
    int next = priorityQueue.poll();
    while (next == smallest) {
      if (priorityQueue.isEmpty()) {
        return -1;
      }
      next = priorityQueue.poll();
    }
    return next;
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
