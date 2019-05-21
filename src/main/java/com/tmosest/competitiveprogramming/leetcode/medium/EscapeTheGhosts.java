package com.tmosest.competitiveprogramming.leetcode.medium;

class EscapeTheGhosts {
  /* Write code here. */

  /**
   * Determine if you can  make it to the target.
   *
   * @param ghosts The location of the ghosts.
   * @param target The target locations.
   * @return True if pac-man can make it to the target in time.
   */
  boolean escapeGhosts(int[][] ghosts, int[] target) {
    int[] source = {0, 0};
    int distance = taxiDistance(source, target);
    for (int[] ghost : ghosts) {
      if (taxiDistance(ghost, target) <= distance) {
        return false;
      }
    }
    return true;
  }

  private int taxiDistance(int[] pointOne, int[] pointTwo) {
    return Math.abs(pointOne[0] - pointTwo[0]) + Math.abs(pointOne[1] - pointTwo[1]);
  }


}
