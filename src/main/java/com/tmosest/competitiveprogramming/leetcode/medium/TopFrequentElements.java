package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class TopFrequentElements {
  /* Write code here. */

  /**
   * Determine the top k elements.
   *
   * @param nums The numbers in the array.
   * @param size The k elements.
   * @return The top k elements as a list.
   */
  public List<Integer> topKFrequent(int[] nums, int size) {
    HashMap<Integer, Integer> counts = new HashMap<>();
    for (int num : nums) {
      Integer count = counts.getOrDefault(num, 0);
      counts.put(num, count + 1);
    }
    PriorityQueue<Pair> queue = new PriorityQueue<>(nums.length, new Comparator<Pair>() {
      @Override
      public int compare(Pair o1, Pair o2) {
        return o2.count - o1.count;
      }
    });
    for (int key : counts.keySet()) {
      queue.add(new Pair(key, counts.getOrDefault(key, 0)));
    }
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      if (!queue.isEmpty()) {
        result.add(queue.poll().num);
      }
    }
    return result;
  }

  private class Pair {

    int num;
    int count;

    private Pair(int num, int count) {
      this.num = num;
      this.count = count;
    }
  }


}
