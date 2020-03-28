package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class CheapestFlightsWithinStops {

  int findCheapestPrice(int len, int[][] flights, int src, int dst, int stops) {

    List<int[]>[] graph = new List[len];
    for (int i = 0; i < len; i++) {
      graph[i] = new LinkedList<>();
    }

    for (int[] flight : flights) {
      int from = flight[0];
      int to = flight[1];
      int cost = flight[2];
      graph[from].add(new int[]{to, cost});
    }

    PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
    pq.offer(new int[]{src, 0, stops + 1});
    while (!pq.isEmpty()) {
      int[] temp = pq.poll();
      if (temp[0] == dst) {
        return temp[1];
      }
      if (temp[2] == 0) {
        continue;
      }
      for (int[] next : graph[temp[0]]) {
        pq.offer(new int[]{next[0], temp[1] + next[1], temp[2] - 1});
      }
    }
    return -1;
  }
}
