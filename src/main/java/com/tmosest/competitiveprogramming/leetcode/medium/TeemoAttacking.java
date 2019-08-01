package com.tmosest.competitiveprogramming.leetcode.medium;

class TeemoAttacking {

  /**
   * Determine Teemo attack.
   *
   * @param timeSeries Time series.
   * @param duration The duration of the attack.
   * @return The time enemy is poisoned.
   */
  int findPoisonedDuration(int[] timeSeries, int duration) {
    if (duration == 0 || timeSeries.length == 0) {
      return 0;
    }

    int totalTime = 0;
    int beginTime = timeSeries[0];
    for (int time : timeSeries) {
      totalTime += (time < beginTime + duration ? time - beginTime : duration);
      beginTime = time;
    }

    return totalTime + duration;
  }
}
