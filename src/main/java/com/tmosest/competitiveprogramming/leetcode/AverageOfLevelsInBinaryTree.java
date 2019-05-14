package com.tmosest.competitiveprogramming.leetcode;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

  /**
   * Get the average of each level in a binary tree.
   * @param root The root of the tree.
   * @return The average of each level.
   */
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      double average = 0;
      for (int i = 0; i < size; i++) {
        root = queue.poll();
        average += root.val;
        if (root.left != null) {
          queue.add(root.left);
        }
        if (root.right != null) {
          queue.add(root.right);
        }
      }
      average /= size;
      result.add(average);
    }

    return result;
  }
}
