package com.tmosest.competitiveprogramming.leetcode.medium;

class TotalHammingDistance {
  /* Write code here. */

  /**
   * Compute the hamming distance of all pairs of numbers.
   *
   * @param nums An array of integers.
   * @return The total hamming distance.
   */
  public int totalHammingDistance(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        result += Integer.bitCount(nums[i] ^ nums[j]);
      }
    }
    return result;
  }


}
