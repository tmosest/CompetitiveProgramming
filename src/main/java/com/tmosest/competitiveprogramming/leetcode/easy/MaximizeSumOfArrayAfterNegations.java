package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.PriorityQueue;

class MaximizeSumOfArrayAfterNegations {
  /* Write code here. */

  /**
   * Largest sum after k negations.
   *
   * @param array The array to sum.
   * @param size The number of negations.
   * @return The largest sum.
   */
  public int largestSumAfterNegations(int[] array, int size) {
    PriorityQueue<Integer> que = new PriorityQueue<>();
    for (int num : array) {
      que.add(num);
    }
    int cnt = 0;
    while (cnt < size) {
      int num = que.poll();
      que.add(0 - num);
      cnt++;
    }
    int sum = 0;
    while (que.size() > 0) {
      sum = sum + que.poll();
    }
    return sum;
  }


}
