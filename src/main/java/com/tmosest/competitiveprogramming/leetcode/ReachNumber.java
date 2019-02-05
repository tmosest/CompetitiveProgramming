package com.tmosest.competitiveprogramming.leetcode;

public class ReachNumber {

  /**
   * Determine the number of steps to reach the target.
   * @param target The target point.
   * @return The number of steps.
   */
  public int reachNumber(int target) {
    target = Math.abs(target);
    int steps = 0;
    while (target > 0) {
      target -= ++steps;
    }
    return target % 2 == 0 ? steps : steps + 1 + steps % 2;
  }
}
