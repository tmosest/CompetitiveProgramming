package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class HighFive {

  int[][] highFive(int[][] items) {
    Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

    for (int i = 0; i < items.length; i++) {
      if (!map.containsKey(items[i][0])) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(items[i][1]);
        map.put(items[i][0], pq);
      } else {
        map.get(items[i][0]).add(items[i][1]);
        if (map.get(items[i][0]).size() > 5) {
          map.get(items[i][0]).poll();
        }
      }
    }

    int[][] res = new int[map.size()][2];
    int index = 0;

    for (Map.Entry<Integer, PriorityQueue<Integer>> e : map.entrySet()) {
      int sum = 0;
      for (int i : e.getValue()) {
        sum += i;
      }

      res[index][0] = e.getKey();
      res[index][1] = sum / 5;
      index++;
    }

    return res;
  }
}
