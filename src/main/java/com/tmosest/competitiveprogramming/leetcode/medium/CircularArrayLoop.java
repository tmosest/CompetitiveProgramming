package com.tmosest.competitiveprogramming.leetcode.medium;

class CircularArrayLoop {

  int num;
  int[] nums;

  /**
   * Determine circular array loop.
   *
   * @param nums The nums in the array.
   * @return True if circular.
   */
  boolean circularArrayLoop(int[] nums) {
    if (nums == null || nums.length < 2) {
      return false;
    }
    num = nums.length;
    this.nums = nums;
    for (int i = 0; i < num; i++) {
      if (cycleExists(i)) {
        return true;
      }
    }

    return false;
  }

  private boolean cycleExists(int from) {
    int temo = from;
    int cycleLength = 0;
    boolean foundCycle = false;
    boolean forwardDirection = nums[temo] > 0;

    while (cycleLength++ < num) {
      temo = Math.floorMod(temo + nums[temo], num);
      boolean newDirectionIsAlsoForward = nums[temo] > 0;
      if (newDirectionIsAlsoForward != forwardDirection) {
        return false;
      }
      if (temo == from) {
        foundCycle = true;
        break;
      }
    }

    return foundCycle && cycleLength > 1 && Math.abs(from - temo) != 1;
  }
}
