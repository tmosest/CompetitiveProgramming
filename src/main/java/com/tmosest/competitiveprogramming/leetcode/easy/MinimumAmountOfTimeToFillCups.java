package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.PriorityQueue;

class MinimumAmountOfTimeToFillCups {

  public int fillCups(int[] amount) {
    int ans = 0;
    int n = amount.length;
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    for (int i = 0; i < n; i++) {
      if (amount[i] != 0) {
        pq.add(amount[i]);
      }
    }
    while (pq.size() > 1) {
      int x = pq.poll();
      int y = pq.poll();
      ans++;
      if (x - 1 != 0) {
        pq.add(x - 1);
      }
      if (y - 1 != 0) {
        pq.add(y - 1);
      }
    }
    if (pq.size() > 0) {
      ans += pq.poll();
    }
    return ans;
  }
}
