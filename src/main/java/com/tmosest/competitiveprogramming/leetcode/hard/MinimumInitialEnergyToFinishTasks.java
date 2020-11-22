package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;
import java.util.Comparator;

class MinimumInitialEnergyToFinishTasks {

  int minimumEffort(int[][] tasks) {
    int energy = 0;
    Arrays.sort(tasks, Comparator.comparingInt(a -> (a[1] - a[0])));
    for (int[] a : tasks) {
      energy = Math.max(energy + a[0], a[1]);
    }
    return energy;
  }
}
