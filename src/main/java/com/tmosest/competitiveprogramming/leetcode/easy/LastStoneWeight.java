package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Comparator;
import java.util.PriorityQueue;

class LastStoneWeight {

  /**
   * Determine how much weight is left after smashing stones.
   *
   * @param stones The weights of the stones.
   * @return The final weight of the final stone.
   */
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(stones.length, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    });
    for (int stone : stones) {
      queue.add(stone);
    }
    while (queue.size() > 1) {
      int heaviest = queue.poll();
      int nextHeaviest = queue.poll();
      if (heaviest != nextHeaviest) {
        queue.add(heaviest - nextHeaviest);
      }
    }
    if (queue.size() > 0) {
      return queue.poll();
    }
    return 0;
  }
}
