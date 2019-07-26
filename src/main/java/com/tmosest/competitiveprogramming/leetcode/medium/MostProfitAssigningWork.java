package com.tmosest.competitiveprogramming.leetcode.medium;

import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;

class MostProfitAssigningWork {

  /**
   * Determine the most profit that can be made.
   *
   * @param difficulty The difficulty of the tasks.
   * @param profit The profits.
   * @param worker The workers.
   * @return The amount of profit.
   */
  int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    int len = difficulty.length;
    Point[] jobs = new Point[len];
    for (int i = 0; i < len; ++i) {
      jobs[i] = new Point(difficulty[i], profit[i]);
    }
    Arrays.sort(jobs, Comparator.comparingInt(a -> a.x));
    Arrays.sort(worker);

    int ans = 0;
    int index = 0;
    int best = 0;
    for (int skill : worker) {
      while (index < len && skill >= jobs[index].x) {
        best = Math.max(best, jobs[index++].y);
      }
      ans += best;
    }

    return ans;
  }
}
