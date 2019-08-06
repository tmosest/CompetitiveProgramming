package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MostFrequentSubtreeSum {

  private Map<Integer, Integer> sumToFreq = new HashMap<>();
  private List<Integer> resultList = new ArrayList<>();
  private int maxFreq = 0;

  /**
   * Most frequent sub-tree sum.
   *
   * @param root The root of the tree.
   * @return The most frequent sub tree sum.
   */
  int getSum(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int sum = getSum(root.left) + getSum(root.right) + root.val;
    int freq = sumToFreq.getOrDefault(sum, 0) + 1;
    if (freq > maxFreq) {
      maxFreq = freq;
      resultList.clear();
      resultList.add(sum);
    } else if (freq == maxFreq) {
      resultList.add(sum);
    }
    sumToFreq.put(sum, freq);
    return sum;
  }
}
