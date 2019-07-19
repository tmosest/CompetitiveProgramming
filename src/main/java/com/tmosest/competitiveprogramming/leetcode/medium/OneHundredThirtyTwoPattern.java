package com.tmosest.competitiveprogramming.leetcode.medium;

class OneHundredThirtyTwoPattern {

  /**
   * Determine if 1 3 2 pattern.
   *
   * @param nums The numbers.
   * @return True if 1 3 2 patter.
   */
  boolean find132pattern(int[] nums) {

    for (int i = 1; i < nums.length - 1; i++) {
      int curr = nums[i];
      int next = nums[i + 1];
      int prev = nums[i - 1];

      if (next < curr && prev < next) {
        return true;
      }
    }

    return false;
  }
}
