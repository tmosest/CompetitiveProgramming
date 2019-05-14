package com.tmosest.competitiveprogramming.leetcode.medium;

class ContinuousSubarraySum {
  /* Write code here. */

  /**
   * Determine if a continous sub-array of length 2+ has the sum.
   *
   * @param nums Array of integers.
   * @param sumToFind The sum to find.
   * @return True if there is a sub-array of length 2+ with the sum.
   */
  public boolean checkSubarraySum(int[] nums, int sumToFind) {
    if (nums.length < 2) {
      return false;
    }
    int[] sums = new int[nums.length];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      sums[i] = sum;
    }
    for (int i = 1; i < nums.length; i++) {
      if (sumToFind == 0) {
        if (sums[i] == 0) {
          return true;
        }
      } else if (sums[i] % sumToFind == 0) {
        return true;
      }
    }
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 2; j < nums.length; j++) {
        if (sumToFind == 0) {
          if ((sums[j] - sums[i]) == 0) {
            return true;
          }
        } else if ((sums[j] - sums[i]) % sumToFind == 0) {
          return true;
        }
      }
    }
    return false;
  }


}
