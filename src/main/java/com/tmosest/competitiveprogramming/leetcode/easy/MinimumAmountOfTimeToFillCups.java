package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.PriorityQueue;

class MinimumAmountOfTimeToFillCups {

  public int fillCups(int[] amount) {
    int ans = 0;
    int num = amount.length;
    PriorityQueue<Integer> pq = new PriorityQueue<>((one, two) -> two - one);
    for (int i = 0; i < num; i++) {
      if (amount[i] != 0) {
        pq.add(amount[i]);
      }
    }
    while (pq.size() > 1) {
      int one = pq.poll();
      int two = pq.poll();
      ans++;
      if (one - 1 != 0) {
        pq.add(one - 1);
      }
      if (two - 1 != 0) {
        pq.add(two - 1);
      }
    }
    if (pq.size() > 0) {
      ans += pq.poll();
    }
    return ans;
  }
}
