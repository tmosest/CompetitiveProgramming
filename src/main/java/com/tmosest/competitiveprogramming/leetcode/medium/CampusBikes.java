package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class CampusBikes {

  /**
   * Assign bikes.
   *
   * @param workers Workers.
   * @param bikes Bikes.
   * @return Stuff.
   */
  public int[] assignBikes(int[][] workers, int[][] bikes) {
    int workerIndex = workers.length;
    int bikeIndex = bikes.length;
    int[] wo = new int[workerIndex];
    int[] bi = new int[bikeIndex];
    Arrays.fill(wo, -1);
    Arrays.fill(bi, -1);
    PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
      @Override
      public int compare(int[] left, int[] right) {
        return left[0] != right[0] ? left[0] - right[0]
            : (left[1] != right[1] ? left[1] - right[1]
                : (left[2] - right[2]));
      }
    });
    for (int i = 0; i < workerIndex; i++) {
      for (int j = 0; j < bikeIndex; j++) {
        int[] worker = workers[i];
        int[] bike = bikes[j];
        int dist = Math.abs(worker[0] - bike[0]) + Math.abs(worker[1] - bike[1]);
        pq.offer(new int[]{dist, i, j});
      }
    }
    int assigned = 0;
    while (!pq.isEmpty() && assigned < workerIndex) {
      int[] val = pq.poll();
      if (wo[val[1]] == -1 && bi[val[2]] == -1) {
        wo[val[1]] = val[2];
        bi[val[2]] = val[1];
        assigned++;
      }
    }
    return wo;
  }
}
