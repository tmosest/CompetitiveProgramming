package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

class MinimumJumpsToReachHome {

  int minimumJumps(int[] forbidden, int forwards, int backwards, int target) {
    int furthest = 2001 + forwards + backwards;
    int[][] pos = new int[furthest][2];
    for (int val : forbidden) {
      pos[val][0] = -1;
      pos[val][1] = -1;
    }
    int step = 0;
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);
    while (!queue.isEmpty()) {
      for (int i = queue.size(); i > 0; i--) {
        int cur = queue.poll();
        if (Math.abs(cur) == target) {
          return step;
        }

        if (Math.abs(cur) + forwards < furthest && pos[Math.abs(cur) + forwards][0] != -1) {
          queue.add(Math.abs(cur) + forwards);
          pos[Math.abs(cur) + forwards][0] = -1;
        }
        if (cur - backwards >= 0 && pos[cur - backwards][1] != -1) {
          queue.add(-(cur - backwards));
          pos[cur - backwards][1] = -1;
        }
      }
      step++;
    }
    return -1;
  }
}
