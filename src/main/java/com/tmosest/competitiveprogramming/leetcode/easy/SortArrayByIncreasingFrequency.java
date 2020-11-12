package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class SortArrayByIncreasingFrequency {

  int[] frequencySort(int[] nums) {
    int[] counts = new int[201];
    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
      @Override
      public int compare(int[] one, int[] two) {
        if (one[1] == two[1]) {
          return two[0] - one[0];
        } else {
          return one[1] - two[1];
        }
      }
    });
    for (int num : nums) {
      counts[num + 100]++;
    }
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > 0) {
        pq.offer(new int[]{i - 100, counts[i]});
      }
    }
    int idx = 0;
    while (!pq.isEmpty()) {
      int[] info = pq.poll();
      Arrays.fill(nums, idx, idx + info[1], info[0]);
      idx += info[1];
    }
    return nums;
  }
}
