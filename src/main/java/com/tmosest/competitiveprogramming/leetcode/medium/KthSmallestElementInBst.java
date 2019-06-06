package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.Comparator;
import java.util.PriorityQueue;

class KthSmallestElementInBst {

  /**
   * Determine the kth smallest element in a BST.
   *
   * @param root The root of the tree.
   * @param kthSmallest The index.
   * @return The kth smallest element.
   */
  public int kthSmallest(TreeNode root, int kthSmallest) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
      }
    });
    fillQueue(root, queue);
    for (int i = 0; i < kthSmallest - 1; i++) {
      queue.poll();
    }
    return queue.peek();
  }

  private void fillQueue(TreeNode root, PriorityQueue<Integer> queue) {
    if (root == null) {
      return;
    }
    queue.add(root.val);
    fillQueue(root.left, queue);
    fillQueue(root.right, queue);
  }
}
