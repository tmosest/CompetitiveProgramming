package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

class MaximumNumberOfEatenApples {

  int eatenApples(int[] apples, int[] days) {
    PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
      @Override
      public int compare(int[] one, int[] two) {
        return one[1] - two[1];
      }
    });
    int day = 0;
    for (int i = 0; i < apples.length || !queue.isEmpty(); i++) {
      if (i < apples.length) {
        queue.offer(new int[]{apples[i], i + days[i]});
      }
      while (!queue.isEmpty() && queue.peek()[1] <= i) {
        queue.poll();
      }
      if (!queue.isEmpty()) {
        day++;
        queue.peek()[0]--;
        if (queue.peek()[0] == 0) {
          queue.poll();
        }
      }
    }
    return day;
  }
}
