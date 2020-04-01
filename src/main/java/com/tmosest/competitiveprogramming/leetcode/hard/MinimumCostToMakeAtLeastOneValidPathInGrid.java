package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Comparator;
import java.util.PriorityQueue;

class MinimumCostToMakeAtLeastOneValidPathInGrid {

  int[][] costs = {{0, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}};
  int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

  int minCost(int[][] grid) {
    int oneLen = grid.length;
    int twoLen = grid[0].length;
    boolean[][] visited = new boolean[oneLen][twoLen];
    PriorityQueue<Entry> pq = new PriorityQueue<>(new Comparator<Entry>() {
      public int compare(Entry one, Entry two) {
        return one.cost - two.cost;
      }
    });
    pq.offer(new Entry(0, 0, 0));
    while (!pq.isEmpty()) {
      Entry cur = pq.poll();
      if (cur.left == oneLen - 1 && cur.right == twoLen - 1) {
        return cur.cost;
      }
      visited[cur.left][cur.right] = true;
      for (int d = 0; d < 4; d++) {
        int nx = cur.left + dirs[d][0];
        int ny = cur.right + dirs[d][1];
        int cost = cur.cost + costs[grid[cur.left][cur.right] - 1][d];
        if (nx >= 0 && nx < oneLen && ny >= 0 && ny < twoLen && visited[nx][ny] == false) {
          pq.offer(new Entry(nx, ny, cost));
        }
      }
    }
    return 0;
  }


  private static class Entry {

    private int left;
    private int right;
    private int cost;

    private Entry(int left, int right, int cost) {
      this.left = left;
      this.right = right;
      this.cost = cost;
    }
  }

}
